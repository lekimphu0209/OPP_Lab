public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // Create new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Add DVDs
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        // Print cart
        anOrder.printCart();

        // Remove one DVD
        anOrder.removeDigitalVideoDisc(dvd2);

        anOrder.printCart();
    }
}