package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() { return title; }
    public float getCost() { return cost; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Media)) return false;
        Media m = (Media) o;
        return this.title.equals(m.title);
    }
}