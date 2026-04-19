package hust.soict.dsai.test.media;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.*;

public class MediaTest {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();

        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Lion King", "Animation", 19.95f, "Disney", 90);
        Book book = new Book(2, "Clean Code", "Education", 45.0f);
        CompactDisc cd = new CompactDisc(3, "Best Hits", "Music", 25.0f, "Producer", 0, "Artist");

        Track t1 = new Track("Song 1", 200);
        Track t2 = new Track("Song 2", 180);
        cd.addTrack(t1);
        cd.addTrack(t2);

        mediaList.add(dvd);
        mediaList.add(book);
        mediaList.add(cd);

        for (Media m : mediaList) {
            System.out.println(m.toString());
        }
    }
}