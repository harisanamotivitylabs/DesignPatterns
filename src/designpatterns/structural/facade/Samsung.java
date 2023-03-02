package designpatterns.structural.facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung Edge 9 model");
    }

    @Override
    public void price() {

        System.out.println("65000");
    }
}
