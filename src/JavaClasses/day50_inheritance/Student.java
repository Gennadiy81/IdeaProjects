package JavaClasses.day50_inheritance;
                 //IS-A
public class Student extends Person{
    String school;

    public void studying(String topic){
        System.out.println(name + "is studying topic = " + topic + " at " + school);
    }

}
