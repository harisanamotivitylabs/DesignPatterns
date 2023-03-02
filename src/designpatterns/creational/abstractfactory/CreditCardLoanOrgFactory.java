package designpatterns.creational.abstractfactory;

public class CreditCardLoanOrgFactory implements LoanOrgFactory {
    private int loanId;
    private String name;
    private double loanAmount;

    public CreditCardLoanOrgFactory(int loanId, String name, double loanAmount) {
        this.loanId = loanId;
        this.name = name;
        this.loanAmount = loanAmount;
    }

    @Override
    public Loan grantLoan() {
        return new CreditCardLoan(loanId, name, loanAmount);
    }
}
