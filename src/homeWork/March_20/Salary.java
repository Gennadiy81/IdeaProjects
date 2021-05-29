package homeWork.March_20;

public class Salary {
    public static void main(String[] args) {
        double hourlyRate = 45; int weeklyHours = 40, numberOfWeeks = 45;
              double  salary = hourlyRate * weeklyHours * numberOfWeeks;

        if (hourlyRate <= 0) {
            System.out.println("Hourly Rate cannot be Negative or Zero");
          }else if (weeklyHours < 1 || weeklyHours > 65) {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
             }else if(numberOfWeeks <= 0 || numberOfWeeks > 52){
                        System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                   }else{
                        System.out.println("Your salary " + salary + "$");
                    }
                }
            }













