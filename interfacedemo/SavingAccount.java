package OOPConcept.abstraction.interfacedemo;

public class SavingAccount implements Account{
    private double balance;
    private float interestRate;
    SavingAccount(){
        balance=0;
        interestRate=50;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
        }else System.out.println("I haven't enough money");
    }

    @Override
    public void deposite(double amount) {
      balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance ;
    }

    @Override
    public double calculateInterest() {
        return (balance*(interestRate/100));
    }
}
