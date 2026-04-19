package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args) {

        Store store = new Store();
        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Avengers", "Action", 10.5f, 120, "Marvel");
        Book book = new Book(2, "Java Basics", "Education", 5.0f);

        Track t1 = new Track("Song 1", 3);
        Track t2 = new Track("Song 2", 4);

        CompactDisc cd = new CompactDisc(3, "Music CD", "Music", 8.0f, 0, "Unknown", "Artist");
        cd.addTrack(t1);
        cd.addTrack(t2);

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);

        store.show();

        cart.addMedia(dvd);
        cart.addMedia(cd);

        cart.print();
        System.out.println("Total cost: " + cart.totalCost());

        dvd.play();
        cd.play();
    }
}