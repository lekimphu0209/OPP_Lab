package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> items = new ArrayList<>();

    public void addMedia(Media m) {
        items.add(m);
        System.out.println("Added: " + m.getTitle());
    }

    public void removeMedia(Media m) {
        items.remove(m);
    }

    public float totalCost() {
        float sum = 0;
        for (Media m : items) sum += m.getCost();
        return sum;
    }

    public void print() {
        for (Media m : items) {
            System.out.println(m);
        }
    }
}