package firstDirectory.topic8;


public class Book {

    private String titlu;
    private String autor;
    private int numarDeSerie;
    private int pagini;
    private String culoarea;

    public Book(String titlu, String autor, int numarDeSerie, int pagini, String culoarea) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarDeSerie = numarDeSerie;
        this.pagini = pagini;
        this.culoarea = culoarea;
    }


    @Override
    public String toString() {
        return "Book" +
                "Book name = " + titlu +
                ", Book author = " + autor +
                ", Series number= " + numarDeSerie +
                ", Number of pages = " + pagini +
                ", Colour of the book = " + culoarea;
    }

}

