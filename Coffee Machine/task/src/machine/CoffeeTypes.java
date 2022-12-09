package machine;

import java.util.HashMap;

public class CoffeeTypes {

    private static final int[] espresso = new int[] {-250, 0, -16, -1, 4};
    private static final int[] latte = new int[] {-350, -75, -20, -1, 7};
    private static final int[] cappuccino = new int[] {-200, -100, -12, -1, 6};

    public static HashMap<String, Integer> getIngredientsForCoffee (String coffeeType) {
        int[] chosenCoffee = new int[5];

        switch (coffeeType) {
            case "espresso":
                chosenCoffee = espresso;
                break;
            case "latte":
                chosenCoffee = latte;
                break;
            case "cappuccino":
                chosenCoffee = cappuccino;
                break;
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("water", chosenCoffee[0]);
        map.put("milk", chosenCoffee[1]);
        map.put("beans", chosenCoffee[2]);
        map.put("cups", chosenCoffee[3]);
        map.put("money", chosenCoffee[4]);

        return map;
    }
}
