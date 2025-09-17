class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }

    void deposit(double balance2){
        balance = balance+balance2;

        System.out.println("Deposited: $"+balance2);
        System.out.println("Current balance: $"+balance);
    }
    void withdraw(double balance2){
        balance = balance-balance2;
        System.out.println("Withdraw: $"+balance2);
        System.out.println("Current balance: $"+balance);
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(double balance){
        super(balance);
    }
    @Override
    void withdraw(double balance2){
        
        if (balance-balance2<100){
            System.out.println("Withdrawal denied: Balance cannot fall below $100");

        }
        else{
            super.withdraw(balance2);
        }
    System.out.println("Current balance: $" + balance);
        
    }
}
public class Inheritance5 {
    public static void main (String [] args){
        BankAccount ba=new BankAccount(500);
        System.out.println("Current balance: $" + ba.balance);
        ba.deposit(200);
        ba.withdraw(550);
        SavingAccount SC=new SavingAccount(700);
    
    } 
    
}
