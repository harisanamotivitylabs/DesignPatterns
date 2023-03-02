package designpatterns.behaviour.observer;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unSubscribe(Subscriber subscriber);

    void uploadVideo(String title);

    void sendNotification();
}
