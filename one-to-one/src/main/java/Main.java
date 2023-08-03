import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("A0001", "Arthur C. Clarke", "Panadura", "01774512029");
        Book book1 = new Book("B0002", "Hathpana", author1);

        Book book2 = new Book("B0003", "Madolduuwa");
        Author author2 = new Author("A0002", "Sugathan", "Bandaragama", "0774512027");
        book2.setAuthorName(author2);

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author1);
        session.persist(book1);

        session.persist(author2);
        session.persist(book2);

        transaction.commit();

        session.close();
    }
}
