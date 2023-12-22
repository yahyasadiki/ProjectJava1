package Class;

//2.2. Gestion des Utilisateurs
//Enregistrement des utilisateurs avec leurs informations personnelles.
//Possibilité de définir des rôles d'accès (membre, bibliothécaire, administrateur).
//Modification des informations des utilisateurs.
//Suppression d'un utilisateur de la base de données.

public class Utilisateur {
    private int id;
    private String nom;
    private String age;
    private Role role;

    public enum Role {
        Membre, Bibliothecaire, Administrateur
    }

    public Utilisateur(int id, String nom, String age, Role role) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.role = role;
    }

    public void modifiertilisateur(Utilisateur utilisateur, String nom, String age, Role role) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.role = role;
    }

    public void supprimerutilisateur(Utilisateur utilisateur) {
        this.id = 0;
        this.nom = null;
        this.age = null;
        this.role = null;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String age() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Role role() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age='" + age + '\'' +
                ", role=" + role +
                '}';
    }
}