import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public class ListeDeLivres implements Serializable {
    private HashMap<String, Livre> liste;

    public ListeDeLivres() {
        liste = new HashMap<String, Livre>();
    }

    public void ajouterUnLivre() {
        Livre nouveau = new Livre();
        String cle = nouveau.getCode();
        if (liste.get(cle) == null) {
            liste.put(cle, nouveau);
        } else {
            System.out.println("Ce livre a déjà été saisi !");
        }
    }

    public void rechercherUnLivre(String na, String pa, String c, String i) {
        Livre tmp = new Livre(null, c, na, pa, i);
        String cle = tmp.getCode();
        System.out.println("---> " + cle);
        tmp = (Livre) liste.get(cle);
        if (tmp != null) tmp.afficherUnLivre();
        else System.out.println(pa + " " + na + " est inconnu ! ");
    }

    public void supprimerUnLivre(String na, String pa, String c, String i) {
        Livre tmp = new Livre(null, c, na, pa, i);
        String cle = tmp.getCode();
        tmp = (Livre) liste.get(cle);
        if (tmp != null) {
            liste.remove(cle);
            System.out.println(pa + " " + na + " a été supprimé ");
        }
    }

    public void afficherLesLivres() {
        if (liste.size() != 0) {
            Collection<Livre> c = liste.values();
            for (Livre tmp : c) tmp.afficherUnLivre();
        } else System.out.println("Il n'y a pas de livre dans cette liste");
    }
}
