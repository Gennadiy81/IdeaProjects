package JavaClasses.day55_abstraction.exercise_exam;

public class Running extends Exercise{

    @Override
    public void perform() {

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
