package firstDirectory.topic6;

public class Main {
    public static void main(String[] args) {
        try {
            ContulPersoanei cont = new ContulPersoanei("John", 100, 500);
            cont.sustragereDeBani(5.0);
            cont.transferCatreOPersoana(100);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
