package bankAccountExample;
public class BankAccount {

    private float balance = 0;
    private long accountNum;

    private BankAccount(long newAccountNum) {
        this.accountNum = newAccountNum; //private constructor 
    }

    public BankAccount(float newBalance, long newAccountNum) {
        this(newAccountNum);//public constructor (calls another constructor
        this.balance = newBalance;
    }

    public static BankAccount newBankAccount() { //static method called newbankaccount which passes value to private constructor
        return new BankAccount(80105101114115L); // calls constructor with 1 argument i.e. accountNum
    } //

    public float getBalance(){
        return balance;
    }
    public long getAccountNum(){
        return accountNum;
    }
}

/* private - The code is only accessible within the declared class
 * default i.e. no modifier included
 * protected - The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
   public - The class is accessible by any other class, The code is accessible for all classes, */
   // class inside of another class can be private as it is nested

// for private variables only code inside class can ACCESSS; ANY SUBCLASS/SEPERATE CLASS CANNOT ACCESS
// private methods ACCESSED BY getter and setter methods