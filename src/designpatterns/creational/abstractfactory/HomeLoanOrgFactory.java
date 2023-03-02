package designpatterns.creational.abstractfactory;

public class HomeLoanOrgFactory implements LoanOrgFactory {
    private int loanId;
    private String name;
    private double loanAmount;

    public HomeLoanOrgFactory(int loanId, String name, double loanAmount) {
        this.loanId = loanId;
        this.name = name;
        this.loanAmount = loanAmount;
    }
    @Override
    public Loan grantLoan() {
        return new HomeLoan(loanId, name, loanAmount);
    }
}
