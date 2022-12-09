package machine;

import java.util.Scanner;

public class CoffeeService {

    public void makeCoffee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                if (StorageCheckService.checkStorage("espresso")){
                    Storage.updateStorageAfterCoffee("espresso");
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;

            case "2":
                if (StorageCheckService.checkStorage("latte")){
                    Storage.updateStorageAfterCoffee("latte");
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;

            case "3":
                if (StorageCheckService.checkStorage("cappuccino")){
                    Storage.updateStorageAfterCoffee("cappuccino");
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;

            case "back":
                break;
        }
    }
}
