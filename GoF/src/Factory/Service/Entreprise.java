package Factory.Service;

import Factory.AbstractFactory.AbstractFactory;
import Factory.Catalogue.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    public static AbstractFactory fac;

    public List<Vehicule> vehicules;

    public Entreprise() {
        this.vehicules = new ArrayList<>();
    }

    public void setFac(AbstractFactory abs) {
        fac = abs;
    }

    public void createCamion(String name, String model, int mat) {
        Vehicule v = fac.creerCamion(name, model, mat);
        vehicules.add(v);
    }

    public void createVoiture(String name, String model, int mat) {
        Vehicule v = fac.creerVoiture(name, model, mat);
        vehicules.add(v);
    }
}
