package BankManager;

public class Main {
    public static void main(String[] args) {
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        certificateOfDeposit.account = "Caleb";
        checkingAccount.account = "Ade";
        savingsAccount.account = "Tola";

        System.out.println(certificateOfDeposit.account);
        System.out.println(checkingAccount.account);
        System.out.println(savingsAccount.account);
    }

    
}
