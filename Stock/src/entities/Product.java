package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return getPrice() * getQuantity();
    }

    public int addProduct(int quantity){
        return this.quantity += quantity;
    }

    public int removeProduct(int quantity){
        return this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return getName() + ", $ " + String.format("%.2f",getPrice()) + ", " + getQuantity() +" units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
