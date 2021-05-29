package homeWork.May_11_CastomClasses;

public class MyPerson {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Make";
        personOne.age = 39;
        personOne.gender = 'M';
        personOne.job = "SDET";
        personOne.personInfo();
        personOne.run();
        personOne.runMiles(101);

        personOne.burnCalorieWithMile(personOne.burnCalorieWithMile(100));



    }
}
