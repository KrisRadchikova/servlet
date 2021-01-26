package by.tms.home.servlet;

import by.tms.home.model.Basket;
import by.tms.home.model.Book;
import by.tms.home.model.User;
import by.tms.home.storage.InMemoryBookStorage;
import by.tms.home.storage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myBooks")
public class BasketServlet extends HttpServlet {

    private final InMemoryBookStorage inMemoryBookStorage = InMemoryBookStorage.getInstance();
    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Book book = inMemoryBookStorage.getById(Integer.parseInt(id));

        Basket basket = new Basket();
        basket.addBooks(book);

        User user = (User) req.getSession().getAttribute("user");
        user.setBasket(basket);

        resp.sendRedirect("/basket");
    }


}
