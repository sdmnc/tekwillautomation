package firstDirectory.Inheritance;

public class Vehicle {

    String color = "blue";
    int numberOfWheels = 4;


    public void showCarDetails() {

        System.out.println(color);
        System.out.println(numberOfWheels);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showCarDetails();
        myCar.showCarBrand();

    }
}