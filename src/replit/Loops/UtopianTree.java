package replit.Loops;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 0;
        int treeSize = 0;
        for (int i = 0; i <= 10; i++){
            if (i <= 2){

                year++;
                treeSize++;
                System.out.println("year " + year + " - growth 1 cm");
                System.out.println( "tree size: " + treeSize + "cm");

            }else if(i <= 10){

                year++;
                treeSize+=2;
                System.out.println("year " + year + " - growth 2 cm");
                System.out.println("tree size: " + treeSize + "cm");
            }

        }



    }
}
