package by.tms.home.storage;

import by.tms.home.model.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookStorage {
    private List<Book> book = new ArrayList<>();

    private static InMemoryBookStorage inMemoryBookStorage;

    private InMemoryBookStorage(){
    }

    public static InMemoryBookStorage getInstance(){
        if(inMemoryBookStorage == null){
            inMemoryBookStorage = new InMemoryBookStorage();
            return inMemoryBookStorage;
        }
        return inMemoryBookStorage;
    }

    {

        book.add(new Book(1,"Carrie", "is an epistolary horror novel by American author Stephen King",
                24.57, "https://images-na.ssl-images-amazon.com/images/I/91P7rIp-ayL.jpg"));
        book.add(new Book(2, "Harry Potter and the Philosopher's Stone", "For a highly organized mind, death is another adventure",
                28.80, "https://1.belpotter.by/files/2013/06/HP1cover.jpg"));
        book.add(new Book(3, "The Master and Margarita", "Manuscripts don't burn", 22.90,
                "https://s1.livelib.ru/boocover/1000992989/o/f2f1/Mihail_Bulgakov__Master_i_Margarita.jpeg"));

    }

    public List<Book> getAll(){
        return new ArrayList<>(book);
    }
    public Book getById(int id){
        for (Book book : book){
            if(book.getId() == id)
                return book;
        }
        return null;
    }
}
