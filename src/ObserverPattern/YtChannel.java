package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YtChannel implements Channel{
    private List<Subscriber> subscribers = new ArrayList();
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber s: subscribers){
            s.update(videoTitle);
        }
    }

    public void upload(String videoTitle){
       notifySubscribers(videoTitle);
    }
}
