package designpatterns.structural.adapter;

public class PayAdapter implements PayMoney{
    Paytm paytm=new Paytm();
    @Override
    public double pay(double pay) {
        return paytm.pay(pay);
    }
}
