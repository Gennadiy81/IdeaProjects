package JavaClasses.day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {


    User user1 = new User();
    user1.setId(1234);
    user1.setName("Martha");
    user1.setRole("Student");

    Admin admin1 = new Admin();
    admin1.setId(43145);
    admin1.setName("Ivanka");
    admin1.setRole("Admin");

    Admin admin2 = new Admin();

        System.out.println(user1.toString());
        System.out.println(admin1.toString());


    }
}