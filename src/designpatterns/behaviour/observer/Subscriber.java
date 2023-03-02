package designpatterns.behaviour.observer;

public class Subscriber implements Observer{
    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("hey ,"+name+" video uploaded "+channel.getTitle());
    }

    @Override
    public void subscribeChannel(Channel channel) {

        channel.subscribe(this);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", channel=" + channel +
                '}';
    }
}
