package by.tms.home.servlet;

import by.tms.home.model.User;
import by.tms.home.storage.InMemoryBookStorage;
import by.tms.home.storage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/basket")
public class BasketViewServlet extends HttpServlet {

    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        req.setAttribute("book", user.getBasket().getAll());
        getServletContext().getRequestDispatcher("/pages/basket.jsp").forward(req, resp);
    }
}