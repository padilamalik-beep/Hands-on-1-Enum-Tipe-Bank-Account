public class Main {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            Account account = new Account(type);
            System.out.println(type.name() + ": " + account.getType());
        }
    }
}
