public class Customer {
    private static int counter = 1;
    private final int number;
    private final String name;

    public Customer(String name) {
        this.name = name;
        this.number = counter++;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "#" + number + " - " + name;
    }
}
