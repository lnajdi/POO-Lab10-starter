package Exercice2;

// Créez une classe d'exception personnalisée nommée ExceptionSoldeInsuffisant
    // qui étend la classe Exception.
public class ExceptionSoldeInsuffisant extends  {
    
    // Fournissez un constructeur qui accepte un message de chaîne
        // pour personnaliser le message de l'exception.
    public ExceptionSoldeInsuffisant(String message) {
        
        super(message);
    }
}