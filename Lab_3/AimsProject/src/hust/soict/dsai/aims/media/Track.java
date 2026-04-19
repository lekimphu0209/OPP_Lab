package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public void play() {
        if (length > 0) {
            System.out.println("Playing Track: " + title + " - length: " + length);
        } else {
            System.out.println("ERROR: Track length is non-positive!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Track)) return false;
        Track t = (Track) o;
        return this.title.equals(t.title) && this.length == t.length;
    }
}