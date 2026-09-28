package assignment1;

public class TicketType {

    private final String name;
    private final double price;

    public TicketType(String name, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Ticket type name is required");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}