package designpatterns.creational.abstractfactory;

public class FinanceFactory  {

    public static Loan getLoan(LoanOrgFactory loanOrgFactory)
    {
        return loanOrgFactory.grantLoan();
    }
}
