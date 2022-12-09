package machine;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Map<String, Integer> storage = new HashMap<>();

    public static Map<String, Integer> getStorage() {
        return storage;
    }

    public static void setStorage(int water, int milk, int beans, int cups, int money) {
       storage.put("water", water);
       storage.put("milk", milk);
       storage.put("beans", beans);
       storage.put("cups", cups);
       storage.put("money", money);
    }

    public static void printStorage() {
        System.out.println("The coffee machine has:");
        System.out.println(Storage.getStorage().get("water") + " ml of water");
        System.out.println(Storage.getStorage().get("milk") + " ml of milk");
        System.out.println(Storage.getStorage().get("beans") + " g of coffee beans");
        System.out.println(Storage.getStorage().get("cups") +  " disposable cups");
        System.out.println("$" + Storage.getStorage().get("money") +  " of money");
    }

    public static void updateStorageElement (String element, int amount) {
        int oldAmount = Storage.getStorage().get(element);
        storage.put(element, oldAmount += amount);
    }

    public static void updateStorageAfterCoffee (String coffeeType) {
        HashMap<String, Integer> ingredients = CoffeeTypes.getIngredientsForCoffee(coffeeType);

        for (String key : ingredients.keySet()) {
            int valueToUpdate = Storage.storage.get(key);
            Storage.storage.put(key, valueToUpdate += ingredients.get(key));
        }
    }
}
