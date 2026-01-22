package ObserverPattern;

public class Main {
    public static void main(String[] args){
        Subscriber s1 = new User("Nirmala");

        YtChannel channel1 = new YtChannel();
        channel1.subscribe(s1);
        channel1.upload("Happy birthday");
    }
}
