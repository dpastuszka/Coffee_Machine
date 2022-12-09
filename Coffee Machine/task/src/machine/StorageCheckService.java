package machine;

import java.util.HashMap;

public class StorageCheckService {

    public static boolean checkStorage (String typeOfCoffee) {
        boolean isEnoughIngredients = true;

        HashMap<String, Integer> ingredients = CoffeeTypes.getIngredientsForCoffee(typeOfCoffee);
        for (String key : ingredients.keySet()) {
            int amountNeeded = ingredients.get(key);
            int amountInStorage = Storage.getStorage().get(key);

            if (-amountNeeded <= amountInStorage) {
            } else {
                System.out.println("Sorry, not enough " + key +"!");
                isEnoughIngredients = false;
                break;
            }
        }
        return isEnoughIngredients;
    }
}
