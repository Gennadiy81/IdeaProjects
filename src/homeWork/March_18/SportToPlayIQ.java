package homeWork.March_18;

public class SportToPlayIQ {
    public static void main(String[] args) {
        double fee = 100;
        String sport = (fee == 100) ? "Soccer or tennis" : "Other activities";

            System.out.println(sport + " fee: " + fee);
        String sport1 = "Soccer";
        int fee1 = sport1.equals("Soccer") && sport.equals("Tennis") ? 100 : 50;
        System.out.println(sport1 + ": $" + fee1);
        }
    }



