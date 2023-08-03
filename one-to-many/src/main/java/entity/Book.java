package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private String id;
    private String bookName;

    @ManyToOne
    private Author author;

    public Book(String id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Book() {

    }
}
