package OOPConcept.abstraction.interfacedemo;

public class Main {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService(new CreaditAccount());
        bankingService.deposite(2000);
        System.out.println("Credit account Balance: "+bankingService.showBalance()+"$");
        System.out.println(".............................................................");
        BankingService bankingService1 = new BankingService(new SavingAccount());
        bankingService1.deposite(300);
        bankingService1.withdrawMoney(200);
        System.out.println("Saving Account Balance: "+bankingService1.showBalance());
        System.out.println("...........................................................");

        //accessing Old way:
        BankingServicesII bankingServicesII = new BankingServicesII(new SavingAccount());
        bankingServicesII.addMoney(2000);
        System.out.println("Money :"+bankingServicesII.showBalance());

    }
}
