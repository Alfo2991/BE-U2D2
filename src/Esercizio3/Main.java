package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Esercizio3 rubrica = new Esercizio3();

        Scanner input = new Scanner(System.in);

        String scelta;
        do {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Inserisci un contatto");
            System.out.println("2. Cancella un contatto");
            System.out.println("3. Cerca un contatto");
            System.out.println("4. Stampa la rubrica");
            System.out.println("0. Esci");

            scelta = input.nextLine();

            switch (scelta) {
                case "1":
                    System.out.println("Inserisci il nome del contatto:");
                    String nome = input.nextLine();

                    System.out.println("Inserisci il numero di telefono:");
                    String numero = input.nextLine();

                    rubrica.inserisciContatto(nome, numero);
                    break;

                case "2":
                    System.out.println("Inserisci il nome del contatto che vuoi cancellare:");
                    nome = input.nextLine();

                    rubrica.cancellaContatto(nome);
                    break;

                case "3":
                    System.out.println("Inserisci il nome o il numero di telefono del contatto:");
                    String ricerca = input.nextLine();

                    String risultato = rubrica.cercaNome(ricerca);
                    if (risultato != null) {
                        System.out.println("Il numero di " + risultato + " è: " + ricerca);
                        System.out.println("Premi invio per continuare...");
                        input.nextLine();
                    } else {
                        risultato = rubrica.cercaNumero(ricerca);
                        if (risultato != null) {
                            System.out.println("Il numero " + risultato + " appartiene a " + ricerca);
                            System.out.println("Premi invio per continuare...");
                            input.nextLine();
                        } else {
                            System.out.println("Contatto non trovato");
                            System.out.println("Premi invio per continuare...");
                            input.nextLine();
                        }
                    }
                    break;

                case "4":
                    rubrica.stampaRubrica();
                    break;

                case "0":
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        } while (!scelta.equals("0"));

        input.close();
    }
}
