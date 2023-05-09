import java.util.HashMap;

public class Esercizio1 {
    private HashMap<String, String> contatti;

    public Esercizio1() {
        contatti = new HashMap<String, String>();
    }

    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        contatti.remove(nome);
    }

    public String cercaPersonaPerTelefono(String telefono) {
        for (String nome : contatti.keySet()) {
            if (contatti.get(nome).equals(telefono)) {
                return nome;
            }
        }
        return null;
    }

    public String cercaTelefonoPerPersona(String nome) {
        return contatti.get(nome);
    }

    public void stampaContatti() {
        System.out.println("Contatti:");
        for (String nome : contatti.keySet()) {
            System.out.println(nome + ": " + contatti.get(nome));
        }
    }
}
