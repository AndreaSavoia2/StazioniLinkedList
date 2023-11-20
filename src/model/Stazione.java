package model;

public class Stazione {

    private int codStazzione;
    Stazione precedente;
    Stazione successiva;

    public Stazione(int codStazzione) {
        this.codStazzione = codStazzione;
        precedente = null;
        successiva = null;
    }

    public int getCodStazzione() {
        return codStazzione;
    }
}
