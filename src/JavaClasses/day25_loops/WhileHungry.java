package JavaClasses.day25_loops;


public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countTill = 3;
        while(isHungry){

            System.out.println("Eating a banana: " + bananas);

            bananas++;
            if (bananas == countTill){
                isHungry = false;
            }

        }
        System.out.println("Had enough bananas");
    }
}
