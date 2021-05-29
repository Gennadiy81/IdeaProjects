package homeWork.March_28;

public class DynamicAlphabet {
    public static void main(String[] args) {

        char letter = 'Z';
        String ascending = "A - Z",
                descending = "z - a";
        if (letter == 'A' && ascending.equals("A - Z") ) {
            System.out.println("Upper case A to Z");
            for (letter = 'A'; letter <= 'Z'; letter++) {
                System.out.print(letter + " ");
            }
        }else  if (letter == 'a' && ascending.equals("a - z")) {
            System.out.println("Lower case a to z");
            for (letter = 'a'; letter <= 'z'; letter++) {
                System.out.print(letter + " ");
            }
        }else if(letter == 'Z' && descending.equals("Z - A")){
            System.out.println("Upper case Z to A");
            for(letter = 'Z'; letter >= 'A'; letter--){
                System.out.print(letter + " ");
            }
        }else if (letter == 'z' && descending.equals("z - a")){
            System.out.println("Lower case z to a");
            for (letter ='z'; letter >= 'a'; letter--){
                System.out.print(letter + " ");
            }
        }else{
            System.out.println("Invalid entry");
        }
    }
}
