import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Class.*;

public class Test {
    public static void main(String[] args) {
        Utilisateur u1 = new Utilisateur(1, "yahya", "20", Utilisateur.Role.Membre);
        Livre l1 = new Livre("titre1", "auteur1", 2010, "genre1");

        ArrayList<Livre> tabLivres = new ArrayList<Livre>() {{
            add(l1);
        }};

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dateEmprunt = dateFormat.parse("20/11/2020");
            Date dateRetourPrevue = dateFormat.parse("20/11/2020");

            Emprunts e1 = new Emprunts(u1, tabLivres, dateEmprunt, dateRetourPrevue);

            e1.emprunterLivre(l1);
            e1.rendreLivre(l1, dateFormat.parse("1/12/2020"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
