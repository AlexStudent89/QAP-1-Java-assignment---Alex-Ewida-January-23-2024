public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A001", "Fred Brown", 5000);
        Account acc2 = new Account("A002", "Bob Brown", 4000);

        System.out.println("Initial balances:");
        System.out.println("Acc1: " + acc1.getBalance());
        System.out.println("Acc2: " + acc2.getBalance());

        int transferAmount = 1000;
        acc1.transferTo(acc2, transferAmount);

        System.out.println("\nBalances after transfer:");
        System.out.println("Acc1: " + acc1.getBalance());
        System.out.println("Acc2: " + acc2.getBalance());
    }
}
