package designpatterns.structural.facade;

public class BlackBerry implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Black berry 123 model");
    }

    @Override
    public void price() {

        System.out.println("85000");
    }
}
