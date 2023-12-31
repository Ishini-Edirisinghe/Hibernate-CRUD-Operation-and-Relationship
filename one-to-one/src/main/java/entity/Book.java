package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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


    @OneToOne
    private Author authorName;

    public Book() {

    }

    public Book(String id, String title) {
        this.id = id;
        this.bookName = title;

    }
}
