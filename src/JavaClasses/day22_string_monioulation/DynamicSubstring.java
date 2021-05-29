package JavaClasses.day22_string_monioulation;

public class DynamicSubstring {
    public static void main(String[] args){
        String result = "result count:12345";
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        //how to combine in one statement
        System.out.println(result.substring(result.indexOf(":") + 1));
        String today = "i learned [java] today";
        int find1 = today.indexOf("[");
        int find2 = today.indexOf("]");
        System.out.println(today.substring(find1+1, find2));


    }
}
