package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

    public static void main(String[] args) {
        int n = 10;
        List<Integer> lista1 = generaListaCasuale(n);
        System.out.println("Lista casuale: " + lista1);
        List<Integer> lista2 = duplicaEInverti(lista1);
        System.out.println("Lista duplicata e invertita: " + lista2);
        stampaPosizioni(lista2, true);
    }

    public static List<Integer> generaListaCasuale(int n) {
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101)); // Numeri da 0 a 100 inclusi
        }
        Collections.sort(lista); 
        return lista;
    }

    public static List<Integer> duplicaEInverti(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        Collections.reverse(nuovaLista);
        nuovaLista.addAll(lista);
        return nuovaLista;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        System.out.print(pari ? "Posizioni pari: " : "Posizioni dispari: ");
        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
