package Factory.FactoryMethod;

import Factory.Catalogue.Vehicule;
import Factory.Catalogue.Voiture;

public class FabriqueVoiture extends VehiculeFactory {

    private static FabriqueVoiture singleton;

    private FabriqueVoiture() {}

    public static FabriqueVoiture getInstance() {
        if (singleton == null) {
            singleton = new FabriqueVoiture();
        }
        return singleton;
    }

    @Override
    protected Vehicule fabricateVehicule(String name, String model, int mat) {
        return new Voiture(name, model, mat);
    }
}
