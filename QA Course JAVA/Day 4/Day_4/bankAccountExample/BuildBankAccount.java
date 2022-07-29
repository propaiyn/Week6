package bankAccountExample ;

public class BuildBankAccount {
    
    public static void main(String[] args) {
       // BankAccount usr1 = BankAccount.newBankAccount();
       BankAccount usr1 = new BankAccount(123.34f, 23123214);
       System.out.println("Your balance is: " + usr1.getBalance());
       System.out.println("Your balance is: " + usr1.getAccountNum());
    }
}