package replit.Loops;

public class CountTriple {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String str = "xxxabyyyycd"; //scan.next();

        for (int index = 0; index < str.length()- 1; index++) {

                System.out.print(str.charAt(index));
            System.out.println(str.charAt(index + 1));
            if (str.charAt(index) == str.charAt(index + 1)) {
                System.out.println("beep - " + str.charAt(index));
            }
        }
    }
}


