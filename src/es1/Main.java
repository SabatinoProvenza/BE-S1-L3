package es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        // stampa singolo rettangolo
        Rettangolo.stampaRettangolo(r1);


        // stampa due rettangoli
        Rettangolo.stampaDueRettangoli(r1, r2);
    }


}

