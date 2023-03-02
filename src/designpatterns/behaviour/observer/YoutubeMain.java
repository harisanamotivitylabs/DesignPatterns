package designpatterns.behaviour.observer;

public class YoutubeMain {
    public static void main(String[] args) {
        Channel selenium=new Channel();
        Subscriber subscriber1=new Subscriber("hari");
        Subscriber subscriber2=new Subscriber("bhaskar");
        Subscriber subscriber3=new Subscriber("kiran");

        subscriber1.subscribeChannel(selenium);
        subscriber2.subscribeChannel(selenium);
        subscriber3.subscribeChannel(selenium);


        selenium.uploadVideo("learn java ");
    }
}
