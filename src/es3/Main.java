package es3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Articolo a1 = new Articolo("A001", "Mouse wireless", 19.99, 50);
        Articolo a2 = new Articolo("A002", "Tastiera meccanica", 59.90, 20);
        Articolo a3 = new Articolo("A003", "Cuffie Bluetooth", 39.50, 15);

        Cliente c1 = new Cliente("C100", "Mario Rossi", "mario.rossi@email.com", LocalDate.now());

        Articolo[] lista = new Articolo[5];
        lista[0] = a1;
        lista[1] = a2;
        lista[2] = a3;

        Carrello carrello = new Carrello(c1, lista);

        carrello.stampaCarrello();
    }
}


