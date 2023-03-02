package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image=new ProxyImage("proxy10mb.jpg");
        image.display();
        System.out.println("second time");
        image.display();
    }
}
