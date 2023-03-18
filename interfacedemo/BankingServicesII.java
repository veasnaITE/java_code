package OOPConcept.abstraction.interfacedemo;

public class BankingServicesII {
    SavingAccount savingAccount;
    CreaditAccount creaditAccount;
    BankingServicesII(){
        savingAccount= new SavingAccount();
        creaditAccount = new CreaditAccount();
    }
    BankingServicesII(SavingAccount savingAccount, CreaditAccount creaditAccount){
        this.savingAccount= savingAccount;
        this.creaditAccount=creaditAccount;
    }
    double showBalance(){
        return savingAccount.checkBalance();
    }
    void addMoney(double amount){
        savingAccount.deposite(amount);
    }
    void withdrawMoney(double amount){
        savingAccount.withdraw(amount);
    }
    double showCreditBalance(){
        return creaditAccount.checkBalance();
    }
    void addCreditMoney(double amount){
        creaditAccount.deposite(amount);
    }
}
