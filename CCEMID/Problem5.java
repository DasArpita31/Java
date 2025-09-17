class BankAccount{
    double balance;

    BankAccount(double balance){
        this.balance=balance;
    }
    void deposit(double balance2){
        balance=balance+balance2;

        System.out.println("Deposited"+balance2);
        System.out.println("Current Balance"+balance);
    }
    void withdraw(double balance2){
        balance = balance - balance2;

        System.out.println("Withdraw"+balance2);
        System.out.println("Current Balance"+balance);
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
        super(balance);
    }
    @Override
    void withdraw(double balance2){
        if(balance<100){
            System.out.println("Withdrew denied:Ba;ance cannot fall below $100");
        }
        else{
            super.withdraw(balance2);
        System.out.println("Current Balance:$"+balance2);
        }

    }
}
public class Problem5 {
    public static void main(String[] args) {
        BankAccount b= new BankAccount(500);
         System.out.println("Current balance: $" + b.balance);
        b.deposit(200);
        b.withdraw(150);
        SavingsAccount s = new SavingsAccount(500);
    }
}
