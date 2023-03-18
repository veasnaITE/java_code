package OOPConcept.abstraction.interfacedemo;

public class CreaditAccount implements Account{
    private double balance;
    private float interestRates;
    private double limitCredit;
    CreaditAccount(){
        balance=10;
        interestRates=30;
        limitCredit=100;
    }
    @Override
    public void withdraw(double amount) {
        if(amount <= limitCredit){
            if (amount<=balance){
                balance-=amount;
            }else System.out.println("Insufficient balance !!");
        }else System.out.println("Amount exceed that limit!!");
    }

    @Override
    public void deposite(double amount) {
     balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return (balance*(interestRates/100));
    }
}
