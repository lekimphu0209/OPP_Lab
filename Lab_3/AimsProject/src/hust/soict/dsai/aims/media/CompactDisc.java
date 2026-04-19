package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public void addTrack(Track t) {
        if (!tracks.contains(t)) {
            tracks.add(t);
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track t : tracks) sum += t.getLength();
        return sum;
    }

    @Override
    public void play() {
        for (Track t : tracks) t.play();
    }
}