import java.util.ArrayList;
import java.util.List;

public class Folder extends Element{

    private List<Element> elements;
    StringBuilder sb = new StringBuilder(this.toString());

    public Folder(String nom, List<Character> permission, int taille, String unite) {
        super(nom, permission, taille, unite);
        this.elements = new ArrayList<>();
    }

    public boolean add(Element e) {
        e.prf = prf + 1;
        taille += e.taille;
        return elements.add(e);
    }

    public boolean remove(Element e) {
        return elements.remove(e);
    }

    public String ls() {
        StringBuilder tab = new StringBuilder("\t".repeat(this.prf));

        for (Element elem: elements) {
            sb.append("\n"+tab);
            sb.append(elem.ls());
        }
        return sb.toString();
    }

    public String toString() {
        return super.toString();
    }

}
