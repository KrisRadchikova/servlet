package by.tms.home.servlet;

import by.tms.home.model.User;
import by.tms.home.storage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/user/findAll", name = "FindAllServlet")
public class FindAllServlet extends HttpServlet {

    private final InMemoryUserStorage userStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> all = userStorage.getAll();
        req.setAttribute("users", all);

        getServletContext().getRequestDispatcher("/pages/findAll.jsp").forward(req, resp);
    }
}
