package OfficeHours.Practice_04_07_2021;

public class PrimeNumberIQ {
    public static void main(String[] args) {
        int number = 50;

        for (int j =2; j <= number; j++){
            boolean isPrime= true;
            for (int i = 2; i < j; i++){
                if (j % i == 0){
                isPrime = false;
                break;
            }
        }
            if (isPrime)
        System.out.println(j);



            }
        }
    }

