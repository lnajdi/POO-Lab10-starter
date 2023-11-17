package Exercice2;

public class CompteBancaire {
    private String nom;
    private double solde;

    // Déclarez une classe CompteBancaire avec un constructeur
    // pour initialiser les attributs nom et solde.
    public CompteBancaire(String nom, double solde) {
        
        this.nom = nom;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    // Déclarez une méthode retirer pour retirer de l'argent du compte. 
    //Assurez-vous que cette méthode lance une ExceptionSoldeInsuffisant si le montant à retirer
    // est supérieur au solde disponible.

    //Le mot-clé throws en Java est utilisé dans la déclaration de méthode 
    //pour indiquer que la méthode peut potentiellement générer une exception de certains types. 
    public void retirer(double montant) throw  {
        
         // L'instruction "throw" est utilisée pour génèrer une exception ExceptionSoldeInsuffisant avec 
        //un message personnalisé en cas de solde insuffisant.

        if (montant > solde) {
            throw new ExceptionSoldeInsuffisant("Solde insuffisant pour effectuer le retrait.");
           
        }
        solde -= montant;
    }
}
