package homeWork.March_20;

public class QualificationForArmy {
    public static void main(String[] args) {
        String citizenShip = "USA";
        boolean resident = false, highSchoolDiploma = true;
        int age = 10;
        if (((citizenShip.equalsIgnoreCase("USA") || resident)) && (age > 18 && age < 35) && highSchoolDiploma) {
            System.out.println("You are qualified for the US Army");
        } else {
            if (citizenShip != ("USA") && !resident) {
                System.out.println(" You must be a U.S. citizen or a resident");
            } else {
                if (age < 18 || age > 35) {
                    System.out.println(" Your age must be between 18 to 35 years old");
                } else{
                    if (!highSchoolDiploma) {
                        System.out.println("You must have a high school diploma");
                    }
                }
              }
            }
        /**
         *  // Scanner object
         *         String citizenship = "USA"; // next()
         *         boolean resident = true; // nextBoolean()
         *
         *         if(citizenship.equalsIgnoreCase("USA") || resident) {
         *             int age = 18; // nextInt()
         *             if(age >= 18 && age <= 35) {
         *                 boolean hasDiploma = true; // nextBoolean()
         *                 if(hasDiploma) {
         *                     System.out.println("You are qualified for the US Army");
         *                 } else {
         *                     System.out.println("You must have a high school diploma");
         *                 }
         *
         *             } else {
         *                 System.out.println("Your age must be between 18 to 35 years old");
         *             }
         *
         *         } else {
         *             System.out.println("You must be a U.S. citizen or a resident");
         *         }
         *     }
         */




        }
    }



























































