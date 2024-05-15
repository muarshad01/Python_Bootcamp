// static variable
// static variable can only be acces by static methods. 
// If visitbly is public, we access it by prefixign the class name, like Car.wheels

public class Car extends Vehicle implements Device {

    // instance variables
    private int year;
    private int voltage;

    // static variable
    static int wheels = 4;

    public Car(String color, String model, int year, int voltage) {
        super(color, model); // calling parent class constructor
        this.year = year;
        this.voltage = voltage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getVoltage() {
        return voltage;
    }

    @Override
    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public static int getWheels() {
        return wheels;
    }

    public static void setWheels(int w) {
        wheels = w;
    }

    public String toString() {
        return "Car: " + getColor() + " : " + getModel() + " : " + getYear() + " : " + getVoltage();
    }
}