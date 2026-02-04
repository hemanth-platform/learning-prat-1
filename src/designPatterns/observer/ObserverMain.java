package designPatterns.observer;

public class ObserverMain {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new Subscriber("Hemanth");
        Observer user2 = new Subscriber("Bunny");

        channel.registerObserver(user1);
        channel.registerObserver(user2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
