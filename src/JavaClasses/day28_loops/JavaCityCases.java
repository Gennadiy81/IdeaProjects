package JavaClasses.day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int day = 1;
        int cases = 0;
        int  sunday =0;
        for (day = 1; day <= 30; day++){


            if(day % 7 == 0){
               cases += 500;

            }else {
                cases+=200;
            }
            System.out.println("Day - " + day + " cases " + cases);
        }
        System.out.println("Total cases" + cases);

    }
}
