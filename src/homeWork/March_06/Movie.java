package homeWork.March_06;

public class Movie {
    public static void main(String[] args){
        String name = "Rambo";
        String genre = "Action";
        int duration = 90, year = 2021;
        double releaseDate = 03.21, ratingsRottenTomatoes = 98.5;
        char ratings = 'R';
        boolean sequelsOrNot = true, dvd = true;

        System.out.println("Tonight we are streaming " + name + " which was released on " + releaseDate +"." + year);
        System.out.println("This " + genre + " movie got a " + ratingsRottenTomatoes + " ratings on Rotten Tomatoes.");
        System.out.println("The rating is " + ratings + " and it runs for " + duration + "min.");
        System.out.println("This is sequel?: " + sequelsOrNot);
        System.out.println("Is it on DVD?: " + dvd);

    }
}
