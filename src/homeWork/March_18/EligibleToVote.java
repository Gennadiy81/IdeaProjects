package homeWork.March_18;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 17;
        String citizen = "US citizen";
        if (age >= 18 && citizen.equals("US citizen")) {
            System.out.println(age + " years old you are eligible to vote");
            System.out.println(citizen + " eligible to vote");

            } else if (age < 18) {
                System.out.println(" You must be at least 18 years old to vote");

                if (citizen.equals("Not US citizen")) {
                    System.out.println(" You must be US citizen in order to vote");


                } else {
                    System.out.println("Requirements not reached to be able to vote ");

                }
            }
        }
    }


