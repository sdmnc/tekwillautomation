package firstDirectory.abstraction;

public class Triangle extends GeometricalForm {
    int a;
    int h;

    @Override
    public void calculateArea() {
        int s = a * h / 2;
    }
}
