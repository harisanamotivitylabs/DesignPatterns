package designpatterns.structural.facade;

public class ShopKeeper  {
    private BlackBerry blackBerry;
    private Nokia nokia;
    private Samsung samsung;

    public ShopKeeper() {
        this.blackBerry = new BlackBerry();
        this.nokia = new Nokia();
        this.samsung = new Samsung();
    }

    public void saleBlackBerry()
    {
        blackBerry.modelNo();
        blackBerry.price();
    }
    public void saleSamsung()
    {
        samsung.modelNo();
        samsung.price();
    }
    public void saleNokia()
    {
        nokia.modelNo();
        nokia.price();
    }
}
