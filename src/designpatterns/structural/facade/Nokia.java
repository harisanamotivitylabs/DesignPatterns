package designpatterns.structural.facade;

public class Nokia implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Nokia  7+ plus  model");
    }

    @Override
    public void price() {

        System.out.println("25000");
    }
}
