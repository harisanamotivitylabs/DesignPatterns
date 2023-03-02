package designpatterns.structural.adapter;

public class MainApp {

    public static void main(String[] args) {
        BookTickets bookTickets=new BookTickets();
       //PayMoney payMoney= new it is an interface so need implementation

       // Paytm paytm=new Paytm();//paytm is not an implementation of payMoney so new adapter to pay with paytm
        PayAdapter payAdapter=new PayAdapter();
        bookTickets.setPayMoney(payAdapter);
        bookTickets.bookTickets();
    }
}
