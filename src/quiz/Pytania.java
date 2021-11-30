package quiz;

public class Pytania {

    private String tresc_pytania;
    private String[] opcje;
    private String odpowiedzi;


    public Pytania() {};

    public Pytania(String tresc, String[] opcje, String odpowiedzi)
    {
        this.tresc_pytania=tresc;
        this.opcje=opcje;
        this.odpowiedzi=odpowiedzi;
    }

    public String getPytanie()
    {
        return tresc_pytania;
    }

    public String getOpcje(int index)
    {
        return opcje[index];
    }

    public String getOdpowiedzi()
    {
        return odpowiedzi;
    }


}
