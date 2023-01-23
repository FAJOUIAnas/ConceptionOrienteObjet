package Factory.Catalogue;

public class Vehicule {

    private String name;
    private String model;
    private int mat;

    public Vehicule(String name, String model, int mat) {
        this.name = name;
        this.model = model;
        this.mat = mat;
    }

    public String getModel() {
        return model;
    }

    public int getMat() {
        return mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", mat=" + mat +
                '}';
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}
