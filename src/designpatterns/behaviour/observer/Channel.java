package designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String title;
    private List<Subscriber> subscribers=new ArrayList<>();



    public List<Subscriber> getSubscribers()
    {
        return this.subscribers;
    }
    @Override
    public void subscribe(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    @Override
    public void unSubscribe(Subscriber subscriber)
    {
        subscribers.remove(subscriber);
    }
    @Override
    public void uploadVideo(String title)
    {
        this.title=title;
        sendNotification();
    }
    @Override
    public void sendNotification()
    {
        for (Subscriber subscriber:this.subscribers) {
            subscriber.update();
        }
    }
    public String getTitle() {
        return title;
    }
}
