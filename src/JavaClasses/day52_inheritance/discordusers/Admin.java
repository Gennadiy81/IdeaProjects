package JavaClasses.day52_inheritance.discordusers;

public class Admin extends User{

    public Admin(){
        super();//call supper class
        System.out.println("Admin class constructor");
    }
    public Admin(String name, int id){
        super("Admin", name, id);
        System.out.println("Admin ");
    }

    public String toString() {
    return "Admin{" + ", role " + getRole() + ", name "
            + getName() + ", id " + getId() + "}";

    }


}
