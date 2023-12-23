
import java.util.Date;
import Class.*;

public class Test {
    public static void main(String[] args) {
        bibliotheque b1 = new bibliotheque("Bibliotheque1", "Adresse1");
        Livre l1 = new Livre("Livre1", "Auteur1", 2000, "Genre1");
        Utilisateur u1 = new Utilisateur(1, "", 78, Enum.valueOf(Utilisateur.Role.class, "Membre"));


        System.out.println(l1.toString());

    }
}
