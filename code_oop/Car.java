// Car.java
public class Car {
    /*
     * In Java, you declare attributes in the class body, outside of any methods,
     * with a definite type. You must define class attributes before they are used.
     */
    private String color;
    private String model;
    private int year;
    private static int wheels;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getWheels() {
        return wheels;
    }

    public static void setWheels(int count) {
        wheels = count;
    }

    @Override
    public String toString() {
        return "{" +
                " color='" + getColor() + "'" +
                ", model='" + getModel() + "'" +
                ", year='" + getYear() + "'" +
                "}";
    }
}