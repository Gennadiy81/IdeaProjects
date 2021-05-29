package JavaClasses.day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println("cs2 = " + cs2);
        System.out.println("cs3 = " + cs3);

        Customer[] todayCustomer = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));
        customerList.add(new Customer("Volodia", 7562));

        System.out.println(todayCustomer[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);

       for (int i = 0; i < customerList.size(); i ++){
           System.out.println(customerList.get(i));
       }

        System.out.println("------- For each loop ------");
       for (Customer each : customerList ){
           System.out.println(each);
       }
        System.out.println("------ Print Names ------ ");
        for (Customer each : customerList ) {
            System.out.println(each.getName());
        }

        System.out.println("-----Lambda expresion ------");
        customerList.forEach(each -> System.out.println(each.getName()));
        for (Customer eachCustomer : customerList){
            System.out.println(eachCustomer);
        }







    }
}
