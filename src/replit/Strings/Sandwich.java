package replit.Strings;

public class Sandwich {
    public static void main(String[] args) {
        String str = "xxbreadjambreadyy";
       int a = str.indexOf("bread");

       int b = str.lastIndexOf("bread");
       String c = str.substring(b);
       System.out.println(c);
        String s = str.substring(a);
    }
}
