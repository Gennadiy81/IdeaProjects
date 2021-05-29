package homeWork.March_18;

public class SportYouPlay {
    public static void main(String[] args){
       // double entranceFee = 50;
       // String sport = entranceFee == 100 ? "Soccer or tennis" : " Other";
      //  System.out.println(sport +": " + entranceFee);



       String sport1 = "Tennis";

        double entranceFee1 = (sport1.equals("Soccer")) || (sport1.equals("Tennis")) ?  100 : 50;
        System.out.println(sport1 + ": " + entranceFee1);


    }
}
