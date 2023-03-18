package OOPConcept.abstraction.interfacedemo;

public class VisalAccount implements Account{
    double balance;
    double limited;
    VisalAccount(){
        balance=0;
        limited=25;
    }
    @Override
    public void withdraw(double amount) {
     if(amount<=limited){
         if (amount<=balance) balance-=amount;
         else System.out.println("You can't withdraw");
     }else System.out.println("Over limited");
    }

    @Override
    public void deposite(double amount) {
       balance +=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
