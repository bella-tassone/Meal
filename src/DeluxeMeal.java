public class DeluxeMeal extends Meal {

    private String sideDish;
    private String drink;

    public DeluxeMeal(String n, String s, String d, double p) {
        super(n, (p+3));
        sideDish = s;
        drink = d;
    }

    public String toString() {
        return ("deluxe " + super.toString());
    }

    public static void main(String[] args) {
        DeluxeMeal burritoCombo = new DeluxeMeal("burrito", "chips", "lemonade", 7.49);
        System.out.print(burritoCombo.toString());
    }
}
