package JavaClasses.day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int second = 0;
        while(second <= 117){
            System.out.println("starting: World's smallest cat \uD83D\uDC08 - BBC "+ second);
            second++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching \uD83D\uDC08, lets start another one");




    }

}
