package homeWork.abstract_Social_Media_Task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements Picture{
  private String username, password;
   private int numberOfFollowers, numberOfFollowing;
   private ArrayList<String> post = new ArrayList<>();
   public Instagram(String username, String password){
       this.username = username;
       this.password = password;
       personalURL = "Instagram.com/" + username;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(int numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    public ArrayList<String> getPost() {
        return post;
    }

    public void setPost(ArrayList<String> post) {
        this.post = post;
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
        if( LocalTime.now().getHour() >= 10 && LocalDateTime.now().getHour() <= 20){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep made");
        }
    }

    @Override
    public void likePicture() {

    }

    @Override
    public void unLikePicture() {

    }

    @Override
    public void sharePicture() {

    }
}





















