package JavaClasses.day40_array_list;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList = " + shoppingList.size());
        System.out.println("is empty shoppingList? = " + shoppingList.size());

        if (shoppingList.isEmpty()) {
            System.out.println("shoppingList is empty kip coding java = " + shoppingList);
        } else {
            System.out.println("go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("chip monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        System.out.println("shoppingList = " + shoppingList.size());
        System.out.println("is empty shoppingList? = " + shoppingList.size());

        if (shoppingList.isEmpty()) {
            System.out.println("shoppingList is empty kip coding java = " + shoppingList);
        } else { 
            System.out.println("go to mall");
        }
        int count = shoppingList.size();
        System.out.println("count = " + count);

        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("Shoes is not on the list");
        }
       shoppingList.remove("shoes");
        System.out.println(shoppingList);

        System.out.println("Done shopping go back to coding");
        shoppingList.clear();
        System.out.println(shoppingList);



    }
}
