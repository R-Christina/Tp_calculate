package main;
import calcul.Calcul;

public class Main {
    public static void main(String[] args) {
        Calcul calcul= new Calcul(1, -3, 2);
        double[] resultat=calcul.calculSeconddegre();
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }
    }
}
