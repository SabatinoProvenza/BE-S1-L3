package es3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] articoli;

    public Carrello(Cliente clienteAssociato, Articolo[] articoli) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotaleCostoArticoli() {
        double totale = 0.0;
        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i] != null) {
                totale += articoli[i].getPrezzo();
            }
        }
        return totale;
    }

    public void stampaCarrello() {
        System.out.println("Cliente associato: " + clienteAssociato);
        System.out.println("Articoli nel carrello:");
        boolean almenoUno = false;

        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i] != null) {
                System.out.println(" - " + articoli[i]);
                almenoUno = true;
            }
        }

        if (!almenoUno) {
            System.out.println(" - (carrello vuoto)");
        }

        System.out.println("Totale costo articoli: " + getTotaleCostoArticoli() + " €");
    }
}
