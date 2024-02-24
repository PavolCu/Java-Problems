import java.lang.reflect.Field;

final class AccountUtils {

    private AccountUtils() { }

    public static void increaseBalance(Account account, long amount) {
        try {
            Field balanceField = Account.class.getDeclaredField("balance");
            balanceField.setAccessible(true);

            long currentBalance = (long) balanceField.get(account);
            balanceField.set(account, currentBalance + amount);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Failed to increase balance: " + e.getMessage());
        }
    }
}