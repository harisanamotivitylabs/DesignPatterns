package designpatterns.structural.adapter;

public class BookTickets {

    private PayMoney payMoney;

    public PayMoney getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(PayMoney payMoney) {
        this.payMoney = payMoney;
    }

    public void bookTickets()
    {
        System.out.println("booked tickets at price "+ payMoney.pay(150));
    }
}
