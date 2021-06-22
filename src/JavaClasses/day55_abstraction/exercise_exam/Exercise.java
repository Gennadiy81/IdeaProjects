package JavaClasses.day55_abstraction.exercise_exam;

public abstract class Exercise {
    public void start(){
        System.out.println("Worming up and starting exercise");
    }

    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);

}
