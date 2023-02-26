package firstDirectory.abstraction;

public class Square extends GeometricalForm {
    int a;

    @Override
    public void calculateArea() {
        int s = a * a;
    }
}
