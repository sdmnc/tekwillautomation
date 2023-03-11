package firstDirectory.Inheritance;

public class Vehicle {
    private String color;
    private int numberOfWheels;

    public Vehicle(String color, int numberOfWheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    ;


    public void showCarDetails() {

        System.out.println(color);
        System.out.println(numberOfWheels);
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", 4);
        myCar.showCarDetails();
        myCar.showCarBrand();

    }
}