package p2;

public class BookMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("sdfds", new Author("Author", 45));
        System.out.println(book);
        System.out.println(book.clone());
        System.out.println();
    }
}
