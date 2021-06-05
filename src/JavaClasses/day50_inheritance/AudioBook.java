package JavaClasses.day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening AudioBook");
        System.out.println("length = " + length);
        System.out.println("narrator = " + narrator);
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("type = " + type);
        System.out.println("price = " + price);
    }
}
