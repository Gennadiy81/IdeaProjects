package homeWork.March_17;

public class EligibleToVote2 {
    public static void main(String[] args) {
        int age = 1;
        String usCitizen = "US citizen";
        if ((age >= 18 ) && (usCitizen.equals("US citizen"))) {
            System.out.println(usCitizen + " and " + age +
                    " years old you are eligible to vote");

        }else if(age < 18) {
            System.out.println(age + " not eligible to vote");

        }else if (usCitizen.equals("Not US citizen")) {
                System.out.println(usCitizen + "You must be US citizen in order to vote");
            } else {
                System.out.println("Invalid entry");

            }
        }
    }
//}
//}

