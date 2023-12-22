package Class;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Emprunts {
    private Utilisateur Utilisateur;
    private ArrayList<Livre> livresEmpruntes;
    private Date dateEmprunt;
    private Date dateRetourPrevue;
    private Date dateRetourEffective;

    public Emprunts(Utilisateur Utilisateur, ArrayList<Livre> livresEmpruntes, Date dateEmprunt, Date dateRetourPrevue) {
        this.Utilisateur = Utilisateur;
        this.livresEmpruntes = livresEmpruntes;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    public void prolongerEmprunt(int joursAjouter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateRetourPrevue);
        calendar.add(Calendar.DAY_OF_MONTH, joursAjouter);
        dateRetourPrevue = calendar.getTime();
    }

    public void rendreLivre(Livre livre, Date dateRetour) {
        Calendar dRetour = Calendar.getInstance();
        dRetour.setTime(dateRetour);

        System.out.println("Date de retour effective: " + dRetour.getTime());
        System.out.println("Date de retour prévue: " + dateRetourPrevue);

        if (dRetour.after(dateRetourPrevue)) {
            double penalite = (double) (dRetour.getTimeInMillis() - dateRetourPrevue.getTime()) / (1000 * 60 * 60 * 24) * 5;
            System.out.println("Vous avez dépassé la date de retour, payez la pénalité (5dh/jour) : " + penalite + " DHS");
        } else {
            System.out.println("Vous avez rendu le livre à temps");
        }

        this.dateRetourEffective = dateRetour;

        livresEmpruntes.remove(livre);
    }

    public ArrayList<Livre> consulterHistoriqueEmprunts(){
        return livresEmpruntes;
    }


    @Override
    public String toString() {
        return "Emprunts{" +
                "idUtilisateur=" + Utilisateur +
                ", livresEmpruntes=" + livresEmpruntes +
                ", dateEmprunt='" + dateEmprunt + '\'' +
                ", dateRetourPrevue=" + dateRetourPrevue +
                '}';}
    public void afficherEmprunts() {
        System.out.println(this.toString());
    }
}
