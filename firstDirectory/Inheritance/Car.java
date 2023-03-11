package firstDirectory.Inheritance;

public class Car extends Vehicle {
    private String carBrand = "Dacia";

    public Car(String color, int numberOfWheels) {
        super(color, numberOfWheels);
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void showCarBrand() {
        System.out.println(carBrand);

    }
}

