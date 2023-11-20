import input.MioScanner;
import model.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList percorso = new DoublyLinkedList();
        MioScanner tastiera = new MioScanner();
        boolean fine = false;

        do{
            switch(tastiera.leggiStringa("\nSeleziona l'operazione da eseguire: \n*1: Aggiungi stazzione alla fine del percorso \n*2: Aggiungi stazzione all'inizio del percorso \n*3: Elimina stazzione \n*4: Stampa percorso \n*5: Dimensione del percorso \n*6: Esci")){
                case "1" -> percorso.appendStazione(tastiera.leggiIntSeVero("Inserisci un codice numerico per indentificare la stazzione"));
                case "2" -> percorso.prependStazione(tastiera.leggiIntSeVero("Inserisci un codice numerico per indentificare la stazzione"));
                case "3" -> percorso.rimuoviStazione(tastiera.leggiIntSeVero("Inserisci un codice numerico della stazzione da eliminare"));
                case "4" -> percorso.stampaPercorso();
                case "5" -> System.out.println("Stazzioni presenti sul percorso: " + percorso.getDimensione());
                case "6" -> fine = true;
                default -> System.out.println("Valore non valido");
            }
        }while(!fine);

    }
}