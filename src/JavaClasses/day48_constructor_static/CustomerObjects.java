package JavaClasses.day48_constructor_static;

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
    }
}
