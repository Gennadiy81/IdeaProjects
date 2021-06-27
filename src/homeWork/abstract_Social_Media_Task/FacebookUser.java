package homeWork.abstract_Social_Media_Task;

import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FacebookUser extends SocialMedia implements Group{
    int numberOfGroups;
    private String username, password, fullName;  private int age, numberOfFriends;
    ArrayList<String> post = new ArrayList<>();

    public void setUsername (String username){
        this.username=username;}

    public String getUsername(){
        return username;}

    public void setPassword (String password){
        this.password=password;}

    public String getPassword(){
        return password;}

    public void setFullName(String fullName){
        this.fullName=fullName;}

    public String getFullName(){
        return fullName;}

    public void setAge(int age){
        this.age=age;}

    public int getAge(){
        return age;}
    public void setNumberOfFriends(int numberOfFriends){
        this.numberOfFriends= numberOfFriends;}

    public int gerNumberOfFriends(){
        return numberOfFriends;}

    static {
        System.out.println("Facebook");
    }

    public FacebookUser(String username){

        this.username = username;
    }

    public FacebookUser(String username, String password){
       this.username = username;
        String facebookUser;
        if(password.contains(username)){
            password = "password";
            facebookUser = username + password;
            this.password = password;
            System.out.println("Password contains username.Default password created: " + password);
        }else {
            this.password = password;
            facebookUser = username + password;
        }
        personalURL = "facebook.com/"+username;
    }
    String tempFullName;
    public FacebookUser(String username, String password, String fullName) {
        this.username = username;
        if (password.contains(username)) {
            password = "password";
            this.password = password;
            System.out.println("Password contains username.Default password created: " + password);
        } else {
            this.password = password;
        }

        tempFullName = fullName.replaceAll(" ", "");
        for (int i = 0; i < tempFullName.length(); i++) {
            if (!Character.isLetter(tempFullName.charAt(i))) {
                fullName = "no name";
                System.out.println("Invalid name " + fullName);
            } else {
                this.fullName = fullName;
            }
        }

        personalURL = "facebook.com/" + username;
    }


    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends) {
//        this.(String username, String password, String fullName);
        this.username = username;
            if (password.contains(username)) {
                password = "password";
                this.password = password;
               System.out.println("Password contains username.Default password created: " + password);
            } else {
                this.password = password;
            }

       tempFullName = fullName.replaceAll(" ", "");
        for (int i = 0; i < tempFullName.length(); i++) {
            if (!Character.isLetter(tempFullName.charAt(i))) {
                fullName = "no name";
                System.out.println("Invalid name " + fullName);
            } else {
                this.fullName = fullName;
                }

            }

            if (numberOfFriends >= 0 && numberOfFriends < 5000){
                this.numberOfFriends = numberOfFriends;
            }else {
               this.numberOfFriends = 0;
                System.out.println("Invalid number of friends, number of friends can not be: " + numberOfFriends);
            }

            if (age > 0){
                this.age = age;
            }else {
                this.age = 0;
                System.out.println("Invalid age, age can not be: " + age);
            }
            personalURL = "facebook.com/"+username;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);

    }

    @Override
    public void post(String body) {
        post.add(body);

    }

    @Override
    public void notifications() {
        if( LocalTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <= 17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep made");
        }

    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "personUrl='" + personalURL + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", post=" + post +
                '}';
    }

    public boolean sentFriendRequest(FacebookUser user){
        int sentRequest = 0;
        if (numberOfFriends <= 5000 && numberOfFriends > 0 && user.numberOfFriends <= 5000 && user.numberOfFriends > 0){
            numberOfFriends++;
            user.numberOfFriends++;
            sentRequest++;
        }

        if (user.numberOfFriends >= 5000){
            System.out.println(user + " cannot accept any more friend request.");
        }
        if (sentRequest > 0){
            System.out.println("Friend request sent." + user);
            return true;
        }else{
            System.out.println("You have reached the limit of friends.");
        }
           return false;
    }

    @Override
    public void joinGroup(String group) {
        numberOfGroups++;
        System.out.println(username + " has join - " + group + " group");
    }

    @Override
    public void leaveGroup(String group) {
        numberOfGroups--;
        System.out.println(username + " has left - " + group + " group");

    }
}
