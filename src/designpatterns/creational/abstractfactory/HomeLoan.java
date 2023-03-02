package designpatterns.creational.abstractfactory;

public class HomeLoan extends Loan{
    private int loanId;
    private String name;
    private double loanAmount;

    public HomeLoan(int loanId, String name, double loanAmount) {
        this.loanId = loanId;
        this.name = name;
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
