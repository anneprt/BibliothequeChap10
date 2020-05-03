import java.util.Scanner;

public class Livre {

    private String titre;
    private String categorie ;
    private String isbn ;
    private String nomAuteur ;
    private String prenomAuteur ;
    private String code ;




    public void setTitre (String valeur) {
        titre = valeur ;
    }

    public void setCategorie (String valeur) {
        categorie = valeur;
    }

    public void setIsbn (String valeur) {
        isbn =valeur;
    }

    public void setNomAuteur (String valeur) {
        nomAuteur =valeur;
    }

    public void setPrenomAuteur (String valeur) {
        prenomAuteur =valeur;
    }


    public String getTitre () {
        return titre;
    }

    public String getCategorie () {
        return categorie;
    }

    public String getIsbn () {
        return isbn;
    }

    public String getNomAuteur () {
        return nomAuteur;
    }

    public String getPrenomAuteur () {
        return prenomAuteur;
    }

    public String getCode() {
        code= setCode ();
        return code;
    }


    private String setCode () {
        String debutNom;
        String debutPrenom;
        String debutCategorie;
        int longueurIsbn;
        String finIsbn;

        debutNom=nomAuteur.substring(0,2);
        debutPrenom=prenomAuteur.substring(0,2);
        debutCategorie=categorie.substring(0,2);
        longueurIsbn=isbn.length();
        finIsbn=isbn.substring((longueurIsbn-2),longueurIsbn);
        return debutNom+debutPrenom+debutCategorie+finIsbn;

    }


    public Livre() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez le titre : ");
        setTitre(lectureClavier.next());
        System.out.print("Entrez la categorie : ");
        setCategorie(lectureClavier.next());
        System.out.print("Entrez le nom de l'auteur : ");
        setNomAuteur(lectureClavier.next());
        System.out.print("Entrez le prenom de l'auteur : ");
        setPrenomAuteur(lectureClavier.next());
        System.out.print("Entrez le numero ISBN : ");
        setIsbn(lectureClavier.next());
    }


    public Livre(String t, String c, String na, String pa, String i) {
        setTitre(t);
        setCategorie(c);
        setNomAuteur(na);
        setPrenomAuteur(pa);
        setIsbn(i);
    }


    public void afficherUnLivre(){
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);
        System.out.println("Categorie : " + categorie);
        System.out.println("ISBN : " + isbn);
        // 8.4 Appel de la méthode invisible
        System.out.println("Code : " + getCode());
    }
}
