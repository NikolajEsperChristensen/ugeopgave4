package opgave2;

public class Product {

    private String name;
    private double price;
    private String[] tags;

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo() {
        StringBuilder sb = new StringBuilder();

        for (String tag : tags) {
            sb.append(tag);
            sb.append(", ");
        }

        System.out.println(
                "Name: " + name +
                        ", Price: " + price +
                        ", Tags: " + sb
        );
    }
    public double getPrice() {
        return price;
    }



}