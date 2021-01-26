package by.tms.home.storage;

import by.tms.home.model.Basket;
import by.tms.home.model.Book;
import by.tms.home.model.Role;
import by.tms.home.model.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserStorage {
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User("Admin", "admin", "admin", Role.ADMIN));
    }

    public boolean save(User user) {
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    public User getByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean passwordLength(String password) {
        if (password.length() > 3 && password.length() < 10) {
            return true;
        }
        return false;
    }

    public List<User> getAll(){
        return new ArrayList<>(users);
    }

    public List<Book> getBooks(User user){
        return null;
    }

    /*public User uniqueLogin(String login){

    }*/

}
