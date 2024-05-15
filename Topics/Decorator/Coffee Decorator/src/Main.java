import java.util.Locale;

class TestDrive {
    private static final int SLEEP_TIME = 1500;

    public static void main(String[] args) throws InterruptedException {
        Coffee simpleEspresso = new Espresso();
        System.out.println(simpleEspresso /* write your code here */
                + " $" + formatSum(simpleEspresso.cost() /* write your code here */));

        Coffee espressoWithDecor = new Espresso();
        /* write your code here */
        espressoWithDecor = new Milk(espressoWithDecor /* write your code here */);
        espressoWithDecor = new Sugar(espressoWithDecor /* write your code here */);
        System.out.println(espressoWithDecor /* write your code here */
                + " $" + formatSum(espressoWithDecor.cost()/* write your code here */));

        Coffee instantWithDecor = new InstantCoffee(); /* write your code here */
        instantWithDecor = new WhippedCream(instantWithDecor /* write your code here */);
        instantWithDecor = new Sugar(instantWithDecor /* write your code here */);
        instantWithDecor = new Sugar(instantWithDecor /* write your code here */);
        instantWithDecor = new Sugar(instantWithDecor /* write your code here */);
        System.out.println(instantWithDecor.getDescription() /* write your code here */
                + " $" + formatSum(instantWithDecor.cost() /* write your code here */));

        System.out.println("I'm drinking my " + instantWithDecor.getDescription());
        Thread.sleep(SLEEP_TIME);
        System.out.println("-I want to add some Whipped Cream to my coffee. " +
                "And don't make a new one! Just add Whipped Cream");
        Thread.sleep(SLEEP_TIME);
        System.out.println("-Okay! But the final price will change");
        Thread.sleep(SLEEP_TIME);
        System.out.println("-I understand");

        instantWithDecor = new WhippedCream(instantWithDecor /* write your code here */);
        System.out.println(instantWithDecor.getDescription() /* write your code here */
                + " $" + formatSum(instantWithDecor.cost() /* write your code here */));
    }

    private static String formatSum(double sum) {

        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Coffee {
    String description;

    String getDescription() {

        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    abstract double cost();
}

class Espresso extends Coffee {
    private static final double ESPRESSO_COST = 1.99;

    Espresso() {
        super();
        description = "Espresso";
    }

    @Override
    double cost() {
        return ESPRESSO_COST;
    }
}

class InstantCoffee extends Coffee {
    private static final double INSTANT_COFFEE_COST = 1.0;

    InstantCoffee() {
        super();
        description = "Instant Coffee";
    }

    @Override
    double cost() {
        return INSTANT_COFFEE_COST;
    }
}

abstract class Decorator extends Coffee {
    abstract String getDescription();
}

class Milk extends Decorator {
    private static final double MILK_COST = 0.13;

    private final Coffee coffee;
    /* write constructor */


    public Milk(Coffee coffee) {
        super();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {

        return coffee.getDescription() /* write your code here */ + ", Milk";
    }

    @Override
    double cost() {
        return MILK_COST + coffee.cost(); /* write your code here */
    }
}

class Sugar extends Decorator {
    private static final double SUGAR_COST = 0.02;

    private final Coffee coffee;

    /* write constructor */

    public Sugar(Coffee coffee) {
        super();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {

        return coffee.getDescription() /* write your code here */ + ", Sugar";
    }

    @Override
    double cost() {
        return SUGAR_COST + coffee.cost(); /* write your code here */
    }
}

class WhippedCream extends Decorator {
    private static final double WHIPPED_CREAM_COST = 0.10;

    private final Coffee coffee;
    /* write constructor */

    public WhippedCream(Coffee coffee) {

        super();
        this.coffee = coffee;
    }

    @Override
    String getDescription() {

        return coffee.getDescription() /* write your code here */ + ", Whipped Cream";
    }

    @Override
    double cost() {
        return WHIPPED_CREAM_COST + coffee.cost() /* write your code here */;
    }
}