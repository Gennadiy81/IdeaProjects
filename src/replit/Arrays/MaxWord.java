package replit.Arrays;

public class MaxWord {
    public static void main(String[] args) {
        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        String outPutt = "";
        for (String each : words) {
            if (each.length() > outPutt.length()) {
                outPutt = each;
            }
        }
        System.out.println(outPutt);
    }
}
