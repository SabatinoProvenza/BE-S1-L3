package es3;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo='" + codiceArticolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", pezziDisponibili=" + pezziDisponibili +
                '}';
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }


}
