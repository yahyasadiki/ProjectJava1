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

    private ArrayList<Utilisateur> statistiquesUtilisateur;
    private ArrayList<Livre> statistiquesLivre;

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
        int a = (int) dRetour.get(Calendar.DAY_OF_MONTH) - dateRetourPrevue.getDate();
        if(a>0){
            System.out.println("non rendu à temps, payer une amendes (5dh/jrs) = "+a*5+"dh");
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
