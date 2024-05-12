class TestDrive {
    public static void main(String[] args) {
        Breakfast bagel = new Bread(); /* write your code here */

        bagel = new Butter(bagel);
        bagel = new Cheese(bagel);
        System.out.println(bagel.getSummary());

        Breakfast bun = new Bread(); /* write your code here */

        bun = new Butter(bun);
        bun = new Jam(bun);
        System.out.println(bun.getSummary());
    }
}

interface Breakfast {
    String getDescription();

    int getKcal();

    default String getSummary() {

        return getDescription() + ". kCal: " + getKcal();
    }
}

class Bread implements Breakfast {
    String description = "Bread";
    private static final int BREAD_KCAL = 200;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getKcal() {
        return BREAD_KCAL;
    }
}

class Butter implements Breakfast {
    private final Breakfast breakfast;
    private static final int BUTTER_KCAL = 50;

    Butter(Breakfast breakfast) {

        this.breakfast = breakfast;
    }

    @Override
    public String getDescription() {
        return "Butter on top of " + breakfast.getDescription(); /* write your code here */
    }

    @Override
    public int getKcal() {
        return breakfast.getKcal() + BUTTER_KCAL; } /* write your code here */
}


class Jam implements Breakfast {
    private final Breakfast breakfast;
    private static final int JAM_KCAL = 120;

    Jam(Breakfast breakfast) {

        this.breakfast = breakfast; }

    @Override
    public String getDescription() {
        return "Jam on top of " + breakfast.getDescription(); /* write your code here */
    }

    @Override
    public int getKcal() {
        return breakfast.getKcal() + JAM_KCAL; } /* write your code here */
}


class Cheese implements Breakfast {
    private final Breakfast breakfast;
    private static final int CHEESE_KCAL = 40;

    Cheese(Breakfast breakfast) {

        this.breakfast = breakfast;
    }

    @Override
    public String getDescription() {
        return "Cheese on top of " + breakfast.getDescription(); /* write your code here */
    }

    @Override
    public int getKcal() {
        return breakfast.getKcal() + CHEESE_KCAL; /* write your code here */
    }
}