
interface Candle {
    void burning();
}

class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    public void addCandle() {
        if (forHalloween) {
            Candle candle = createCandle();
            candle.burning();
        } else {
            System.out.println("We don't need a candle.");
        }
    }

    private Candle createCandle() {
        return new Candle() {
            @Override
            public void burning() {
                System.out.println("The candle is burning! Boooooo!");
            }
        };
    }
}