package by.tms.home.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Book> booksList = new ArrayList<>();

    public void addBooks(Book book){
        booksList.add(book);
    }

    public List<Book> getAll(){
        return new ArrayList<>(booksList);
    }
}
