package replit.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Delivery {
    public static void main(String[] args) {
        int fuel_times = 0;
        int max_fuel = 3;
        List<Integer> deliveries = Arrays.asList(9, 1);
        for (int j = 0; j < deliveries.size(); j++) {
            for (int i = 0; i < deliveries.get(j); i++) {
                fuel_times++;

            }
        }

        if (fuel_times % max_fuel == 1){
            fuel_times = fuel_times / max_fuel;
            fuel_times++;
        }else {
            fuel_times = fuel_times / max_fuel;
        }
        System.out.println(fuel_times);
    }
}
