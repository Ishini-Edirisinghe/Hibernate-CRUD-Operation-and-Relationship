package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private String id;
    private String bookName;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book() {

    }

    public Book(String id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }
}
