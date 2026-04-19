package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> items = new ArrayList<>();

    public void addMedia(Media m) {
        items.add(m);
    }

    public void removeMedia(Media m) {
        items.remove(m);
    }

    public void show() {
        for (Media m : items) {
            System.out.println(m);
        }
    }
}