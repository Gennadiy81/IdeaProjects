package JavaClasses.day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent elementaryStudent = new ElementaryStudent();
            elementaryStudent.setName("Bob");
            elementaryStudent.setAge(1);
            System.out.println(elementaryStudent.toString());
        } catch (Exception e) {
            e.printStackTrace();// Print the error stacktrace and continue
        }

        System.out.println("-----EXECUTION COMPLETED------");
    }
}
