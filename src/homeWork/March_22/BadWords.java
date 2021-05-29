package homeWork.March_22;

public class BadWords {
    public static void main(String[] args) {
        String message = "I like java";
      if(message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
          System.out.println(" “Message not sent”. ");
      }else{
          System.out.println("Message sent");
      }
    }
}
