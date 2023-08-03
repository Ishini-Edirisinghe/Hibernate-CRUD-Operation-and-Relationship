import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("A01", "Mr.Amal Perera", "Panadura", "0123456789");
        Author author2 = new Author("A02", "Mr.Oda", "Japan", "0213456789");

        Book book1 = new Book("B02", "Nature", author1);
        Book book2 = new Book("B03", "One Piece", author1);
        Book book3 = new Book("B04", "Hero", author2);
        Book book4 = new Book("B05", "Poor Dad & Rich Dad",  author2);

        List<Book> books1 = new ArrayList<>();
        books1.add(book1);
        books1.add(book2);

        List<Book> books2 = new ArrayList<>();
        books2.add(book3);
        books2.add(book4);

        author1.setBooks(books1);
        author2.setBooks(books2);

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.persist(author1);
        session.persist(author2);

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        session.persist(book4);


        transaction.commit();

        session.close();
    }
}
