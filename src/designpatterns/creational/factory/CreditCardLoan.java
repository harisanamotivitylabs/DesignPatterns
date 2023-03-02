package designpatterns.creational.factory;

public class CreditCardLoan implements Loan{

    @Override
    public void giveLoan() {
        System.out.println("i got credit card loan");
    }
}
 class HomeCardLoan implements Loan {
    public void HomeLoan() {
        System.out.println("i got Home  loan");
    }

     @Override
     public void giveLoan() {
         System.out.println("i got Home  loan");
     }
 }