package Class;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Emprunts {
    private Utilisateur Utilisateur;
    private Livre livresEmpruntes;
    private Date dateEmprunt;
    private Date dateRetourPrevue;
    private Date dateRetourEffective;
    private boolean statutEmprunt;


    private ArrayList<Utilisateur> statistiquesUtilisateur;
    private ArrayList<Livre> statistiquesLivre;

    public Emprunts(Utilisateur Utilisateur, Livre livresEmpruntes, Date dateEmprunt, Date dateRetourPrevue) {
        this.Utilisateur = Utilisateur;
        this.livresEmpruntes = livresEmpruntes;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        livresEmpruntes.incrementerNbrEmprunts();
        this.statutEmprunt = true;
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
        int a = (int) dRetour.get(Calendar.DAY_OF_MONTH) - dateRetourPrevue.getDate();
        if(a>0){
            System.out.println("non rendu à temps, payer une amendes (5dh/jrs) = "+a*5+"dh");
        }
        this.dateRetourEffective = dateRetour;
        statutEmprunt = false;
    }

    @Override
    public String toString() {
        return "Emprunts{" +
                "Utilisateur=" + Utilisateur +
                ", livresEmpruntes=" + livresEmpruntes +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetourPrevue=" + dateRetourPrevue +
                ", dateRetourEffective=" + dateRetourEffective +
                ", statutEmprunt=" + statutEmprunt +
                '}'; }

    public void afficherEmprunts() {
        System.out.println(this.toString());
    }
}
