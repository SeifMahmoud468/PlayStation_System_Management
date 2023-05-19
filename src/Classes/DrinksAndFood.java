package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DrinksAndFood {
// items in cafiteria 
    private String name;
    private int stock, weekStock;
    private double value;
    static  private Date weekDate = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public DrinksAndFood(String name, double value, int stock, int weekStock) {
        this.name = name;
        this.value = value;
        this.stock = stock;
        this.weekStock = weekStock;
    }

    public DrinksAndFood(String name, double value, int stock) {
        this.name = name;
        this.stock = stock;
        this.value = value;
    }

    public static String getWeekDate() {
        return dateFormat.format(weekDate);
    }

    public static void setWeekDate(String weekDate) {
        try {
            DrinksAndFood.weekDate = dateFormat.parse(weekDate);
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public int getWeekStock() {
        return weekStock;
    }

    public void setWeekStock(int weekStock) {
        this.weekStock = weekStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
