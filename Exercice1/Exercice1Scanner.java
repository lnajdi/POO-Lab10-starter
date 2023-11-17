
public class Exercice1Scanner {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire depuis le clavier
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la valeur de x
        System.out.print("Veuillez entrer la valeur de x : ");
        x = scanner.nextInt();

        // Demande à l'utilisateur de saisir la valeur de y
        System.out.print("Veuillez entrer la valeur de y : ");

        try {
            // Tentative de calculer z comme le résultat de la division de x par y
            int z = x / y;

            // Affichage du résultat de la division
            System.out.println("Le résultat de la division est : " + z);
        } catch (           ) {
            // Gestion de l'exception en cas de division par zéro
            
        } finally {
            // Fermeture de l'objet Scanner pour libérer les ressources

        }
    }
}
