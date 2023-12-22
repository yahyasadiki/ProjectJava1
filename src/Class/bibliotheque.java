package Class;

import java.util.ArrayList;

public class bibliotheque {
    ArrayList<Livre> livres;

    public bibliotheque() {
        livres = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }

    public void modifierLivre(Livre livre, String titre, String auteur, int anneeDePublication, String genre) {
        livre.setTitre(titre);
        livre.setAuteur(auteur);
        livre.setAnneeDePublication(anneeDePublication);
        livre.setGenre(genre);
    }

    public void afficherLivres() {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }

}
