package structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private MediaPlayer mediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            mediaPlayer = new MP3Player();
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String filename) {
        mediaPlayer.play(filename);
    }
}
