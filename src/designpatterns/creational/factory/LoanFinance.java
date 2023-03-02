package designpatterns.creational.factory;

public class LoanFinance {

    public static Loan getLoan(String type)
    {
        Loan loan=null;
        switch (type)
        {
            case "home":
                loan=new HomeCardLoan();
                break;
            case "credit" :
                loan=new CreditCardLoan();
                break;

        }
        return loan;
    }
    public static void main(String[] args) {

        Loan loan=LoanFinance.getLoan("credit");
        loan.giveLoan();
    }
}
