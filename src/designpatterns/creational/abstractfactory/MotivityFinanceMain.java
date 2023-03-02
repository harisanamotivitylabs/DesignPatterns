package designpatterns.creational.abstractfactory;

public class MotivityFinanceMain {

    public static void main(String[] args) {

        Loan homeLoan=FinanceFactory.getLoan(new CreditCardLoanOrgFactory(1022,"hari bhaskar",80000));
        Loan creditCardLoan= FinanceFactory.getLoan(new HomeLoanOrgFactory(1022,"hari bhaskar",80000));
        System.out.println(homeLoan.toString());
        System.out.println(creditCardLoan.toString());
    }


}
