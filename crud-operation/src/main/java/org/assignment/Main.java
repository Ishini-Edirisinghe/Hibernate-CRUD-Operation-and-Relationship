package org.assignment;

import org.assignment.entity.Book;
import org.assignment.util.FactoryConfiguration;
//import org.assignment.entity.Book;
//import org.assignment.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("B0001", "Rendezvous with Rama", "Arthur");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //ADD
        session.persist(book);

        //fetch
        Book book1 = session.get(Book.class, "B0001");
        System.out.println(book1.getBookName());

        //update
        book.setAuthorName("Arthur C. Clarke");
        session.update(book);

        //delete
        session.remove(book);


        transaction.commit();
        session.close();
    }




}

