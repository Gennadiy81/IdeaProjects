package JavaClasses.day39_wrapperclasses;

public class ParseStringIQ {
    public static void main(String[] args) {
        String total = "123";
        int num = Integer.parseInt(total);
        System.out.println("num = " + num);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 100 lines of code";
        String[] indexOfCode = sentence.split(" ");
        int linesOfCode = Integer.parseInt(indexOfCode[2]);
        System.out.println("linesOfCode = " + linesOfCode);
        }

    }

