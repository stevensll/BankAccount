public class Tester {
    public static void main (String[] args) {
        BankAccount testAcct = new BankAccount(95, "somepassword");
        System.out.println(testAcct.getBalance());
        System.out.println(testAcct.getAccountID());
        testAcct.setPassword("somenewpassword");
        System.out.println(testAcct.deposit(-5.23));
        System.out.println(testAcct.getBalance());
        System.out.println(testAcct.deposit(5.23));
        System.out.println(testAcct.getBalance());
    }
}
