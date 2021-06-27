package homeWork.abstract_Social_Media_Task;

public class SocialMediaTest  {
    public static void main(String[] args) {
        FacebookUser facebookUser = new FacebookUser("Gennadiy123", "qwerty", "Mike Smith", 40, 30);
        facebookUser.post("I'm learning Java");
        FacebookUser facebookUser1 = new FacebookUser("Martha123", "password", "Martha", 4, 10);
       System.out.println(facebookUser.sentFriendRequest(facebookUser1));
        System.out.println(facebookUser);

//        String noname = "Mike Smith";
//        String a = noname.replaceAll(" ", "");
//        System.out.println(a);

        System.out.println("facebookUser = " + facebookUser.getFullName());




    }
}
