package structural.adapter;

public class MP4Player implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
