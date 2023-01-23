package Factory.AbstractFactory;

import Factory.Catalogue.CamionHybride;
import Factory.Catalogue.Vehicule;
import Factory.Catalogue.VoitureHybride;

public class FabriqueHybride extends AbstractFactory {

    private static FabriqueHybride instance;

    private FabriqueHybride() {}

    public static FabriqueHybride getInstance() {
        if(instance == null) instance = new FabriqueHybride();
        return instance;
    }

    @Override
    protected Vehicule fabricateVoiture(String name, String model, int mat) {
        return new VoitureHybride(name, model, mat);
    }

    @Override
    protected Vehicule fabricateCamion(String name, String model, int mat) {
        return new CamionHybride(name, model, mat);
    }
}
