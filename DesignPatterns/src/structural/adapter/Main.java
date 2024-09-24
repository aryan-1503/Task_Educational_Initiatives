package structural.adapter;

public class Main {
    public static void main(String[] args) {
        MediaAdapter mp3Player = new MediaAdapter("mp3");
        mp3Player.play("song.mp3");

        MediaAdapter mp4Player = new MediaAdapter("mp4");
        mp4Player.play("movie.mp4");
    }
}
