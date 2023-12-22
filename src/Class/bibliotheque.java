package Class;

import java.util.ArrayList;

public class bibliotheque {
    private ArrayList<Livre> livres;
    private String nom;
    private String adresse;

    public bibliotheque(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
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
