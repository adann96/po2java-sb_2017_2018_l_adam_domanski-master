public class Zadanie6 {

    public static void main(String [] args){

        SavingsAccount person1 = new SavingsAccount(4212);

        person1.payment(2321);
        System.out.println(person1.getAccountBalance());

        person1.calculateMonthlyInterest();
        System.out.printf("%.2f\n",person1.getAccountBalance());

        SavingsAccount.setAnnuallInterestRate(0.9);

        person1.calculateMonthlyInterest();
        System.out.printf("%.2f\n",person1.getAccountBalance());
        System.out.println(SavingsAccount.annuallInterestRate);
    }
}