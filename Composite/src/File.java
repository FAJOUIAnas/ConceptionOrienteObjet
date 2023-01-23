import java.util.List;

public class File extends Element{

    public File(String nom, List<Character> permission, int taille, String unite) {
        super(nom, permission, taille, unite);
    }

    public String ls() {
        return this.toString();
    }

    @Override
    public boolean add(Element e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(Element e) {
        // TODO Auto-generated method stub
        return false;
    }

}
