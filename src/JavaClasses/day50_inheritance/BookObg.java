package JavaClasses.day50_inheritance;

public class BookObg {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "Programing";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);


        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmash";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.title = "Selenium book";
        audioBook.type = "Automation";
        audioBook.price = 78.99;
        audioBook.listen();

        EBook eBook = new EBook();






    }
}
