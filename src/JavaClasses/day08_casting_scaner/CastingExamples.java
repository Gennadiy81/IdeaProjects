package JavaClasses.day08_casting_scaner;

public class CastingExamples {
    public static void main(String [] args){
        byte num1 = 100;
        short num2 = num1;
        int num4 = 1000;
        int num3 = num2;
        long num5 = num4;
        double num7 = 124.4;
        byte num9 = (byte)num7;
        double run1 = 123.987;
        int run2 = (int)run1;

        System.out.println(num7);
        System.out.println("num5 = " + num5);
        System.out.println(run2);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);

        double num15 = 1234.5;
        int num16 =(int)num15;
        System.out.println("num15 = " + num15);
        System.out.println(num16);

        double s1 = 12345.9;
        int s2 = (int)s1;

        System.out.println(s2);


        int num17 = 300;
        byte num18 = (byte)num17;

        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        char letter = 'G';
        int numLetter = 'G';
        System.out.println("letter = " + numLetter);

        double r1 = 22.5;
        int r2 = (int)r1;
        System.out.println(r2);
    }
}
