package JavaClasses.day48_constructor_static;

public class Customer {
    private String name;
    private int id;

    public Customer(){
        name = "Varenik";
        id = 187;
    }
    public Customer(String name, int id){
        //this.id = id;
        //this.mane = name;
        setId(id);
        setName(name);
        System.out.println("2-args constructor");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
