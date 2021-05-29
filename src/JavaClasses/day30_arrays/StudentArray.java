package JavaClasses.day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1 = {"1234", "Adam", "Smith", "Bach22", "(231)345-4567"};
        System.out.println("Student ID - " + student1[0]);
        System.out.println("First name - " + student1[1]);
        System.out.println("Lest name - " + student1[2]);
        System.out.println("Bach number - " + student1[3]);
        System.out.println("Phone number - " + student1[4]);
        System.out.println();

        String[] student2 = new String[5];
        student2[0] = "ID4567";
        student2[1] = "Ivan";
        student2[2] = "Ivanov";
        student2[3] = "Bach21";
        student2[4] = "4357895434";
        System.out.println("Student ID - " + student2[0]);
        System.out.println("First name - " + student2[1]);
        System.out.println("Lest name - " + student2[2]);
        System.out.println("Bach number - " + student2[3]);
        System.out.println("Phone number - " + student2[4]);

        if (student1.length == 5) {
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }
        if (student1.length == student2.length) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }
        System.out.println((student1[1]+ " " + student1[2]).toUpperCase());



    }
}
