package es2;

import java.util.Arrays;

public class Sim {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] chiamate;


    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new Chiamata[5];
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero telefono: " + numeroTelefono);
        System.out.println("Credito: " + credito + " €");
        System.out.println("Ultime 5 chiamate:" + Arrays.toString(chiamate));


    }
}
