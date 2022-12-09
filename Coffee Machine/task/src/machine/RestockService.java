package machine;

import java.util.Scanner;

public class RestockService {

    public static void fillStorage () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int cups = scanner.nextInt();

        Storage.setStorage(
                 Storage.getStorage().get("water") + water,
                Storage.getStorage().get("milk") + milk,
                Storage.getStorage().get("beans") + beans,
                Storage.getStorage().get("cups") + cups,
                Storage.getStorage().get("money"));


    }
}
