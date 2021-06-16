package JavaClasses.day54_adstraction;

public class School {
    public static void main(String[] args) {
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
    }
}
