public class Main {
    public static void main(String[] args) throws Exception {

        Vehicle vehicle;

        vehicle = new Car("Yellow", "Honda", 1969, 240);

        System.out.println(vehicle);

        System.out.println("---");

        vehicle = new Car("Green", "Toyota", 2023, 255);
        System.out.println(vehicle);

        // static variable
        System.out.println("Number of wheels = " + Car.wheels);
        System.out.println("Number of wheels = " + Car.getWheels());
    }
}