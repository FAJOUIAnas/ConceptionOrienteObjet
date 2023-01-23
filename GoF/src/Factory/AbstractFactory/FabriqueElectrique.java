package Factory.AbstractFactory;

import Factory.Catalogue.Camion;
import Factory.Catalogue.CamionElectrique;
import Factory.Catalogue.Vehicule;
import Factory.Catalogue.VoitureElectrique;

public class FabriqueElectrique extends AbstractFactory {

    private static FabriqueElectrique instance;

    private FabriqueElectrique() {}

    public static FabriqueElectrique getInstance() {
        if(instance == null) instance = new FabriqueElectrique();
        return instance;
    }

    @Override
    protected Vehicule fabricateVoiture(String name, String model, int mat) {
            return new VoitureElectrique(name, model, mat);
    }

    @Override
    protected Vehicule fabricateCamion(String name, String model, int mat) {
        return new CamionElectrique(name, model, mat);
    }


}
