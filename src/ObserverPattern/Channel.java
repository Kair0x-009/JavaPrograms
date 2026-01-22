package ObserverPattern;

import java.util.ArrayList;

public interface Channel {
    public void subscribe(Subscriber s);
    public void unsubscribe(Subscriber s);
    public void notifySubscribers(String videoTitle);
}
