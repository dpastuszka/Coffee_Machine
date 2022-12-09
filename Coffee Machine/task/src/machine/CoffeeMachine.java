package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        Storage.setStorage(400, 540, 120, 9, 550);
        CLI cli = new CLI();
        cli.start();
    }
}
