package es1;

public class Rettangolo {

    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.area());
        System.out.println("Perimetro: " + r.perimetro());
    }

    // metodo  per stampare DUE rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);

        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);

        double sommaAree = r1.area() + r2.area();
        double sommaPerimetri = r1.perimetro() + r2.perimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    private double area() {
        return altezza * larghezza;
    }

    private double perimetro() {
        return 2 * (altezza + larghezza);
    }
}

