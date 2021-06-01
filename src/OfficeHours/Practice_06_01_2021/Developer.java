package OfficeHours.Practice_06_01_2021;

public class Developer {
    private static boolean hasCodingSkills;
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;


    public Developer(String name, int employeeID, String jobTitle, double salary,  boolean hasCodingSkills) {
        this.name = name;
        this.employeeId = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasCodingSkills = hasCodingSkills;

    }

    public Developer(String anton, int employeeID, String dev, int salary) {
    }


    public void coding(){
            System.out.println(this.name + " is coding");
        }

        public void fixingBug() {
            System.out.println(this.name + " is fixing a bug");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public static boolean hasCodingSkills() {
            return hasCodingSkills;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", employeeId=" + employeeId +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
}
