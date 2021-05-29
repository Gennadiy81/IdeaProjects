package JavaClasses.day24_loops;

public class LoopReversCondition {
    public static void main(String[] args) {
        int count = 5;
        while(count >=0){
            System.out.println("count - " + count);
            count --;
    }
    System.out.println("Count is finished - " + count);


        int unreadSms = 10;
        while(unreadSms > 0){
            System.out.println("Unread messages - " + unreadSms);
            unreadSms--;
        }
        //unreadSms = unreadSms +1;
        System.out.println("You have - " + unreadSms + " unread messages");
    }
}
