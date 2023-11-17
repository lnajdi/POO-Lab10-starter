package Exercice2;

public class Exercice2 {
    public static void main(String[] args) {
        // Créez une instance de CompteBancaire avec un solde initial
        CompteBancaire compte = new CompteBancaire("Kamal", 1000.0);

        // Scénario 1 : Tentative de retrait d'un montant supérieur au solde actuel
        try {
            compte.retirer(1500.0);
            System.out.println("Retrait effectué avec succès.");
        } catch (ExceptionSoldeInsuffisant e) {
            // Gérez l'exception ExceptionSoldeInsuffisant en affichant un message d'erreur approprié
            System.out.println("Scénario 1 - Erreur : " + e.getMessage());
        }

        // Scénario 2 : Tentative de retrait d'un montant inférieur au solde actuel
        try {
            compte.retirer(500.0);
            System.out.println("Retrait effectué avec succès.");
        } catch (ExceptionSoldeInsuffisant e) {
            // Gérez l'exception ExceptionSoldeInsuffisant en affichant un message d'erreur approprié
            System.out.println("Scénario 2 - Erreur : " + e.getMessage());
        }
    }
}
