package product;

public class Product {
    public int id;
    public String name;
    public String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("product.Product: id= %-10s name= %-10s category= %-10s\n", String.valueOf(id), name, category);
    }
}
