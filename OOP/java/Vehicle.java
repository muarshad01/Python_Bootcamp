// Methods
// - 1. Instance methods
// - 2. Non-Instance methods (static methods)

// Variables
// - 1. Instance variables
// - Non-Instance variables (static variables)

// Encapsulation
// - We declate instance variables as private and then we create public getter and setter methods to access them.

public class Vehicle {

    // instance variables
    private String color;
    private String model;

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "{" +
                " color='" + getColor() + "'" +
                ", model='" + getModel() + "'" +
                "}";
    }
}