import java.util.Scanner;

public class Bibliotheque {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        byte choix = 0;
        ListeDeLivres LdL = new ListeDeLivres();

        String prenom;
        String nom;
        String categorie;
        String isbn;
        do {
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher la liste des livres");
            System.out.println("4. Afficher un livre");
            System.out.println("5. Sortir");
            System.out.println();
            System.out.print("Votre choix : ");
            choix = lectureClavier.nextByte();
            switch (choix) {
                case 1:
                    LdL.ajouterUnLivre();
                    break;
                case 2:

                    System.out.print("Entrer le prénom de l'auteur du livre a supprimer : ");
                    prenom
                            = lectureClavier.next();
                    System.out.print("Entrer le nom de l'auteur du livre a supprimer : ");
                    nom = lectureClavier.next();
                    System.out.print("Entrer la catégorie du livre a supprimer : ");
                    categorie = lectureClavier.next();
                    System.out.print("Entrer les deux derniers chiffres du code ISBN : ");
                    isbn = lectureClavier.next();
                    LdL.supprimerUnLivre(nom, prenom, categorie, isbn);
                    break;

                case 3:
                    LdL.afficherLesLivres();
                    break;
                case 4:

                    System.out.print("Entrer le prénom de l'auteur du livre recherché : ");
                    prenom = lectureClavier.next();
                    System.out.print("Entrer le nom de l'auteur du livre recherché : ");
                    nom = lectureClavier.next();
                    System.out.print("Entrer la catégorie du livre recherché : ");
                    categorie = lectureClavier.next();
                    System.out.print("Entrer les deux derniers chiffres du code ISBN : ");
                    isbn = lectureClavier.next();
                    LdL.rechercherUnLivre(nom, prenom, categorie, isbn);
                    break;
            }


        } while (choix != 5);
    }
}