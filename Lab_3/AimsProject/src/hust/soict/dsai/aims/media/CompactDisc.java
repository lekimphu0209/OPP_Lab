package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor ĐÚNG - gọi super với 6 tham số
    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
        super(id, title, category, cost, director, length);  // ✅ 6 tham số khớp với Disc
        this.artist = artist;
    }

    // Optional: Constructor chỉ có id, title, category, cost, artist (không có director, length)
    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost, null, 0);  // ✅ director = null, length = 0
        this.artist = artist;
    }

    public String getArtist() { return artist; }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Added track: " + track.getTitle());
        } else {
            System.out.println("Track already exists!");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Removed track: " + track.getTitle());
        } else {
            System.out.println("Track not found!");
        }
    }

    @Override
    public int getLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + getTitle() + " - Artist: " + artist);
        System.out.println("CD length: " + getLength());
        for (Track t : tracks) {
            t.play();
        }
    }

    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCost();
    }
}