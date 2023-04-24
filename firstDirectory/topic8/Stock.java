package firstDirectory.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private int stockId;
    private String adresaMagazin;

    private List<Book> stoc = new ArrayList<>();


    public void adaugaCarteaStock(Book book) {
        stoc.add(book);

    }

    public void stergereaCarteaDinStoc(Book book) {
        stoc.remove(book);

    }

    public int nrDeCartiInStoc() {
        int number = stoc.size();
        System.out.println(number);
        return number;
    }

    public Boolean esteStoculGol() {
        boolean stocGol = stoc.isEmpty();
        System.out.println("The stock is empty:" + stocGol);

        return stocGol;
    }
}
