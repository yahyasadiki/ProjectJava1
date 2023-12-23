package Class;


public class Utilisateur {
    private int id;
    private String nom;
    private int age;
    private Role role;

    public enum Role {
        Membre, Bibliothecaire, Administrateur
    }

    public Utilisateur(int id, String nom, int age, Role role) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.role = role;
    }

    public void modifiertilisateur(Utilisateur utilisateur, String nom, int age, Role role) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.role = role;
    }

    public void supprimerutilisateur(Utilisateur utilisateur) {
        this.id = 0;
        this.nom = null;
        this.age = 0;
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

    public int age() {
        return age;
    }

    public void setAge(int age) {
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