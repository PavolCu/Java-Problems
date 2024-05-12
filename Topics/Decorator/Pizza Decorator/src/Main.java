import java.util.Locale;

class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(veganPizzaDecor);
        veganPizzaDecor = new Tomato(veganPizzaDecor);
        veganPizzaDecor = new Spinach(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(meatPizzaDecor);
        meatPizzaDecor = new Chicken(meatPizzaDecor);
        meatPizzaDecor = new Cheese(meatPizzaDecor);
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Vegan extends Pizza {
    private static final double VEGAN_COST = 4.99;

    Vegan() {
        super();
        description = "Vegan";
    }

    @Override
    double cost() {

        return VEGAN_COST;
    }
}

class MeatHeaven extends Pizza {
    private static final double MEAT_HEAVEN_COST = 4.0;

    MeatHeaven() {
        super();
        description = "MeatHeaven";
    }

    @Override
    double cost() {

        return MEAT_HEAVEN_COST;
    }
}

abstract class Decorator extends Pizza {
    Pizza pizza;

    // Default constructor

    Decorator(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", " + this.getClass().getSimpleName();
    }

    @Override
    double cost() {
        return pizza.cost();
    }
}

// Similar changes should be made to the Chicken, Cheese, Broccoli, Tomato, and Spinach classes
class Ham extends Decorator {
    private static final double HAM_COST = 1.0;

    Ham(Pizza pizza) {

        super(pizza);
    }

    @Override
    String getDescription() {

        return pizza.getDescription() + ", Ham";
    }

    @Override
    double cost() {

        return HAM_COST + pizza.cost();
    }
}

class Chicken extends Decorator {
    private static final double CHICKEN_COST = 1.5;

    Chicken(Pizza pizza) {

        super(pizza);
    }

    @Override
    String getDescription() {

        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double cost() {

        return CHICKEN_COST + pizza.cost();
    }
}

class Cheese extends Decorator {
    private static final double CHEESE_COST = 0.2;

    Cheese(Pizza pizza) {

        super(pizza);
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {

        return CHEESE_COST + pizza.cost();
    }
}

class Broccoli extends Decorator {
    private static final double BROCCOLI_COST = 0.1;

    Broccoli(Pizza pizza) {

        super(pizza);
    }

    @Override
    String getDescription() {

        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double cost() {

        return BROCCOLI_COST + pizza.cost();
    }
}

class Tomato extends Decorator {
    private static final double TOMATO_COST = 0.09;

    Tomato(Pizza pizza) {

        super(pizza);
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    double cost() {
        return TOMATO_COST + pizza.cost();
    }
}

class Spinach extends Decorator {
    private static final double SPINACH_COST = 0.09;

    Spinach(Pizza pizza) {
        super(pizza);
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    double cost() {
        return SPINACH_COST + pizza.cost();
    }
}