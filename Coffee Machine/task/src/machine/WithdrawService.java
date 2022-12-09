package machine;

public class WithdrawService {

    public static void withdrawMoney() {
        int amountToWithdraw = Storage.getStorage().get("money");
        System.out.println("I gave you $" + amountToWithdraw);
        Storage.updateStorageElement("money", -Storage.getStorage().get("money"));
    }
}
