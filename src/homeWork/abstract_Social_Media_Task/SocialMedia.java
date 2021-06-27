package homeWork.abstract_Social_Media_Task;

public abstract class SocialMedia {
    String personalURL; int accountLength;
    static String platform;
    public abstract void directMessaging (String username, String message);
    public abstract void post (String body);
    public abstract void notifications ();
}



