import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        Collections.sort(stockItems, new Comparator<StockItem>() {
            @Override
            public int compare(StockItem item1, StockItem item2) {
                double value1 = item1.getPricePerUnit() * item1.getQuantity();
                double value2 = item2.getPricePerUnit() * item2.getQuantity();
                return Double.compare(value2, value1);
            }
        });
        return stockItems;
    }


}