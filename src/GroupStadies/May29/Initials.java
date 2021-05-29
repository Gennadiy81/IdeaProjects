package GroupStadies.May29;
import java.util.*;
public class Initials {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String name = scan.nextLine();
        //String name = "Vlad Smith";
        if(name.equalsIgnoreCase(name) && name.contains(" ")){
            int index = name.indexOf(" ");
            System.out.println(name.toUpperCase().substring(0,1) + "." +
                    name.toUpperCase().charAt(index +1));
        }else{
            System.out.println("Invalid entry");
        }

    }
}
