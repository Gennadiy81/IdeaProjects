package homeWork.April_10;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] indexOf = words.split(", ");
        for (int i = 0; i < indexOf.length; i++){
            if (indexOf[i].contains(" ")){
                System.out.println(indexOf[i]);
            }
        }
    }
}
