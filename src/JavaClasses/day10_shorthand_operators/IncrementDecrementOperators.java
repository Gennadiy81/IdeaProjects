package JavaClasses.day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args){
        int i = 1;
        System.out.println("i = " + i);
        i++;// adds 1
        System.out.println("i = " + i);
        i++; // adds 1
        i++; // add 1
        ++i; // adds 1
        ++i;  // adds 1
        System.out.println("i = " + i);

        int linesOfCode =15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;
        linesOfCode++;
        ++linesOfCode;
        linesOfCode += 1;
        System.out.println("linesOfCode = " + linesOfCode);


        linesOfCode = linesOfCode - 1;
        linesOfCode--;
        linesOfCode -= 1;
        -- linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);


        char letter = 'a';
        System.out.println("letter = " + letter);

        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--; letter--;letter--;
        System.out.println("letter = " + letter);



    }
}
