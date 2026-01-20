package FacadePattern;

public class HomeTheaterFacade {
    private DVDplayer dvd;
    private Projector projector;
    private SoundSystem soundSystem;
    public HomeTheaterFacade() {
        this.dvd = new DVDplayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public void watchMovie(){
        dvd.on();
        projector.on();
        soundSystem.on();
        System.out.println("Movie is Starting....");
    }
}
