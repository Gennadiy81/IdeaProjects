package OfficeHours.Practice_03_17_2021;

public class CybertakBatches {
    public static void main(String[] args) {
        String batchType = "US";
        if (batchType.equals("US") || batchType.equals("us")) {

            boolean isMorning = false;
            if (isMorning) {

                System.out.println("Class times are 10 - 5 ESt");
            }else {
                System.out.println("Class time 7pm to 9pm EST");
            }


            } else if (batchType.equals("EU") || batchType.equals("eu")) {
            System.out.println("Class time are 10 - 5 EST");
            } else  {
            System.out.println("Invalid Batch type");

            }
        }
    }
