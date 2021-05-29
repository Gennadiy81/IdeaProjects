package JavaClasses.day32_arays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] countCats = cats.split("cat");
        System.out.println("number of cats - " + (countCats.length-1));
        for (String each : countCats ){
            System.out.println(each);
        }

    }
}
