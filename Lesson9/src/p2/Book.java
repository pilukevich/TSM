package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book implements Cloneable {
    private String name;
    private Author author;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        book.setAuthor((Author) author.clone());
        return book;
    }
}
