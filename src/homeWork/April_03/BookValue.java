package homeWork.April_03;

public class BookValue {
    public static void main(String[] args){
        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables. " +
                "Chapter 2 conditional statements. chapter 3 String manipulation. " +
                "Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. " +
                "chapter 7 ArrayList. chapter 8 instance and static. " +
                "Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. " +
                "Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. " +
                "Chapter 13 Collections. Chapter 14 Learn more.";
        int bookValue = 1;
        int chapters = 0;
        for (int outer = 0; outer < book.length()-7; outer++){
            String chapter1 = book.substring(outer, outer + 7);
          if(chapter1.equalsIgnoreCase("chapter"))
               chapters++;
        }
        //if (i <= 14 && i > 0){
        bookValue = chapters * 10;
        System.out.println("Book has " + chapters + " chapters" +
             " book cost " + bookValue + "$");
    }
}

