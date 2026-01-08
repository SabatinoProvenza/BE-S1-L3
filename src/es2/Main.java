package es2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("3331234567");


        Chiamata chiamata1 = new Chiamata(2, "3315805304");
        Chiamata chiamata2 = new Chiamata(2, "3315805304");
        Chiamata chiamata3 = new Chiamata(2, "3315805304");
        Chiamata chiamata4 = new Chiamata(2, "3315805304");
        Chiamata chiamata5 = new Chiamata(2, "3315805304");
        Chiamata[] chiamate = {chiamata1, chiamata2, chiamata3, chiamata4, chiamata5};
        sim.setChiamate(chiamate);

        sim.stampaDatiSIM();
    }
}
