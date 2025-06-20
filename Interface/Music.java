package Interface;

public class Music implements Playable {

    public void play() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        Music music = new Music();
        music.play();
    }
}
