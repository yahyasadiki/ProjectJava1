package Class;


public class Livre {
    private String titre;
    private String auteur;
    private int anneeDePublication;
    private String genre;
    private int nbrEmprunts;

    public Livre(String titre, String auteur, int anneeDePublication, String genre) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneeDePublication = anneeDePublication;
        this.genre = genre;
    }

    public void incrementerNbrEmprunts(){
        nbrEmprunts++;
    }

    @Override
    public String toString() {
        return "Class.Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", anneeDePublication=" + anneeDePublication +
                ", genre='" + genre + '\'' +
                ", nbrEmprunts=" + nbrEmprunts +
                '}';
    }

    public String titre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String auteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int anneeDePublication() {
        return anneeDePublication;
    }

    public void setAnneeDePublication(int anneeDePublication) {
        this.anneeDePublication = anneeDePublication;
    }

    public String genre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
