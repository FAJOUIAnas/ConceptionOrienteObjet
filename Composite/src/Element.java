import java.util.List;

public abstract class Element {
    protected String nom;
    protected List<Character> permission;
    protected int taille;
    protected String unite;
    int prf = 1;

    public Element(String nom, List<Character> permission, int taille, String unite) {
        setNom(nom);
        setPermission(permission);
        setTaille(taille);
        setUnite(unite);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Character> getPermission() {
        return permission;
    }
    public void setPermission(List<Character> permission) {
        this.permission = permission;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public String getUnite() {
        return unite;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }

    public abstract String ls();

    public String toString() {
        return nom+"  "+permission+"  "+taille+unite;
    }

    public abstract boolean add(Element e);

    public abstract boolean remove(Element e);

}
