package machine;

import java.util.Scanner;

public class CLI {

    CoffeeService coffeeService = new CoffeeService();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean isOn = true;
        while(isOn) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "buy":
                    coffeeService.makeCoffee();
                    break;
                case "fill":
                    RestockService.fillStorage();
                    break;
                case "take":
                    WithdrawService.withdrawMoney();
                    break;
                case "remaining":
                    Storage.printStorage();
                    break;
                case "exit":
                    isOn = false;
                    break;
            }
        }
    }
}
