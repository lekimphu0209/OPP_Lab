package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "Lion King", "Animation", 19.95f, "Disney", 90);
        Book book = new Book(2, "Clean Code", "Education", 45.0f);
        CompactDisc cd = new CompactDisc(3, "Best Hits", "Music", 25.0f, "Artist");
        cd.addTrack(new Track("Song1", 200));
        cd.addTrack(new Track("Song2", 180));

        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.print();
    }
}