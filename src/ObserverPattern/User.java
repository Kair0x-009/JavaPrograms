package ObserverPattern;

public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String videoTitle){
        System.out.println("Hello! "+ name +" " + "a new video '" +videoTitle + "' has been uploaded!");
    }
}
