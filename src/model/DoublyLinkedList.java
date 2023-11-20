package model;

public class DoublyLinkedList {

    Stazione testa;
    Stazione coda;
    private int dimensione;

    public DoublyLinkedList() {
        this.testa = null;
        this.coda = null;
        this.dimensione = 0;
    }

    //crea un nuovo nodo alla fine della lista
    public void appendStazione(int codiceStazione){
        Stazione nuovaStazione = new Stazione(codiceStazione);
        if (testa == null){
            testa = nuovaStazione;
            coda = nuovaStazione;
        } else{
            coda.successiva = nuovaStazione;
            nuovaStazione.precedente = coda;
            coda = nuovaStazione;
        }
        dimensione++;
    }

    //crea un nuovo nodo all'inizio della lista
    public void prependStazione(int codiceStazione) {
        Stazione nuovaStazione = new Stazione(codiceStazione);
        if (testa == null) {
            testa = nuovaStazione;
            coda = nuovaStazione;
        } else {
            nuovaStazione.successiva = testa;
            testa.precedente = nuovaStazione;
            testa = nuovaStazione;
        }
        dimensione++;
    }

    //rimuove un nodo dalla lista corrispondente al codice della staziione passato dall'utente
    public void rimuoviStazione(int codiceStazione) {
        Stazione stazioneCorrente = testa;
        while (stazioneCorrente != null) {
            if (stazioneCorrente.getCodStazzione() == codiceStazione) {
                if (stazioneCorrente.precedente != null) {
                    stazioneCorrente.precedente.successiva = stazioneCorrente.successiva;
                } else {
                    testa = stazioneCorrente.successiva;
                }
                if (stazioneCorrente.successiva != null) {
                    stazioneCorrente.successiva.precedente = stazioneCorrente.precedente;
                } else {
                    coda = stazioneCorrente.precedente;
                }
                dimensione--;
                return;
            }
            stazioneCorrente = stazioneCorrente.successiva;
        }
    }

    // stampa la lista dei nodi
    public void stampaPercorso() {
        Stazione stazioneCorrente = testa;
        while (stazioneCorrente != null) {
            System.out.print(stazioneCorrente.getCodStazzione() + " -> ");
            stazioneCorrente = stazioneCorrente.successiva;
        }
        System.out.print("Fine");
    }

    // restituisce il numero dei nodi presenti
    public int getDimensione() {
        return dimensione;
    }
}
