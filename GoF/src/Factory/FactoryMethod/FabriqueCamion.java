package Factory.FactoryMethod;

import Factory.Catalogue.Camion;
import Factory.Catalogue.Vehicule;

public class FabriqueCamion extends VehiculeFactory {

    private static FabriqueCamion singleton;

    private FabriqueCamion() {};

    public static FabriqueCamion getInstance() {
        if (singleton == null) {
            singleton = new FabriqueCamion();
        }
        return singleton;
    }

    @Override
    protected Vehicule fabricateVehicule(String name, String model, int mat) {
        return new Camion(name, model, mat);
    }
}
