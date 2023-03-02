package designpatterns.behaviour.observer;

public interface Observer {
    void update();
    void subscribeChannel(Channel channel);
}
