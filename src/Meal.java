public class Meal {

    private String name;
    private double price;

    public Meal(String n, double p) {
        name = n;
        price = p;
    }

    public String toString() {
        return (name + " meal, " + price);
    }

    public static void main(String[] args) {
        Meal burger = new Meal("hamburger", 7.99);
        System.out.print(burger.toString());
    }



























}
