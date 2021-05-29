package homeWork.May_11_CastomClasses;

public class Person {
    String name;
    int age;
    char gender;
    String job;

    public void run(){
        System.out.println(name + " - running");

    }
    public void swim(){
        System.out.println("swimming");

    }
    public void bike(){
        System.out.println("biking");

    }
    public void runMiles(int mileCount){
        System.out.println(name + " is running " + mileCount + " miles");

    }
     public int burnCalorie(){
         System.out.println(name + " is running 1 mile ");
        return 10;

     }
     public int burnCalorieWithMile(int mileCount){
         System.out.println(name + " is running " + mileCount + " mile");
         return 10 * mileCount;

     }
     public void personInfo(){
         System.out.println("Name - " + name + "\nade - " + age +
                 "\ngender - " + gender + "\njob - " + job);
     }
}
