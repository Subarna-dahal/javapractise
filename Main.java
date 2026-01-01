
class Product {
    private String name;
    private int price;
    private int quantity;

    Product(String name, int price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Product cannot be empty");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Price must be greater than Zero");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative:");
            return;
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    void buy(int amount) {
        if (amount <= 0) {
            System.out.println("Purchase amount greater than zero:");
            return;
        }
        if (amount > quantity) {
            System.out.println("Insufficient stuck for "+name);
            return;
        }
        quantity -= amount;
        System.out.println("Successfully purchased "+name);
    }

    void restock(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than Zero");
            return;
        }
        quantity += amount;
        System.out.println(name + " restocked by " + amount);
    }

    void display() {
        System.out.println(name + " has the price of " + price + " with quantity = " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Product b1 = new Product("biscuit", 50, 5);
        Product b2 = new Product("Icecream", 30, 8);
        Product b3 = new Product("Wai Wai", 20, 10);
        b1.buy(3);
        b2.buy(4);
        b3.buy(6);
        b1.restock(4);
        b2.restock(7);
        b3.restock(8);
        b1.display();
        b2.display();
        b3.display();

    }
}