package firstDirectory.topic8;

public class ServiceStock {

    public static void main(String[] args) {
        Book myBook = new Book("1984", "Orowell", 01, 100, "Green");
        System.out.println(myBook.toString());
        Stock stock = new Stock();
        stock.adaugaCarteaStock(myBook);

        Book myBook2 = new Book("Bible", "Paul", 100, 386, "Grey");
        Book myBook3 = new Book("Best recipes", "Kitchen Chef", 50, 145, "White");
        Book myBook4 = new Book("Fairy Tales", "Andreson", 33, 50, "Red");
        Book myBook5 = new Book("007", "Fleming", 5, 150, "Black");
        Book myBook6 = new Book("Dracula", "Stoker", 10, 99, "Black and red");

        stock.adaugaCarteaStock(myBook2);
        stock.adaugaCarteaStock(myBook3);
        stock.adaugaCarteaStock(myBook4);
        stock.adaugaCarteaStock(myBook5);
        stock.adaugaCarteaStock(myBook6);
        stock.toString();
        stock.nrDeCartiInStoc();
        stock.esteStoculGol();
        stock.stergereaCarteaDinStoc(myBook4);
        stock.nrDeCartiInStoc();
    }


}

