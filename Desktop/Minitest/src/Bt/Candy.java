package Bt;

public class Candy {
    private static int id = 1;
    private String color;
    private String nature;
    private int quantily;
    private double price;

    public Candy() {
    }

    public Candy(int id, String color, String nature, int quantily, double price) {
        this.color = color;
        this.nature = nature;
        this.quantily = quantily;
        this.price = price;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", nature='" + nature + '\'' +
                ", quantily='" + quantily + '\'' +
                ", price=" + price +
                '}';
    }
}
