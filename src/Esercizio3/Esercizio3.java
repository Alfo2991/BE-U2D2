package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3 {
    private Map<String, String> contatti;

    public Esercizio3() {
        contatti = new HashMap<>();
        contatti.put("Mario Bros", "264616512");
        contatti.put("Luigi Kart", "162984656");
        contatti.put("Wario World", "162498496");
    }

    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        contatti.remove(nome);
    }

    public String cercaNumero(String nome) {
        return contatti.get(nome);
    }

    public String cercaNome(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void inserisciContattoDaConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il nome:");
        String nome = input.nextLine();
        System.out.println("Inserisci il numero di telefono:");
        String telefono = input.nextLine();
        inserisciContatto(nome, telefono);
        System.out.println("Contatto inserito correttamente.");
        input.close();

            }

}
