package JavaClasses.day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
         int count = 0;
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines",
                "China", "Philippines", "China", "Armenia", "Philippines", "China",
                "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China",
                "United States", "Russia"};
        System.out.println("----- prices less than 100 -----");
        for (double eachPrice : prices){
            if (eachPrice < 100){
                System.out.print(eachPrice + " ");
            }

        }
        System.out.println("\n----- prices between 10 and 70 inclusive -----");
        for (double price : prices){
            if (price <= 70 && price >= 10) {
                System.out.print(price + " ");
            }
        }

        System.out.println("\n----- count prices mor than 50 -----");
        for ( double countPrice : prices){
            if (countPrice >= 50){
                 count++;

            }
        }
        System.out.println(count);

        System.out.println("\n ----- countries with length more then 7 -----");
        for (String countCountries : countries){
            if (countCountries.length() >= 7){

                System.out.println(countCountries +   " - " + countCountries.length());
            }

        }



    }
}
