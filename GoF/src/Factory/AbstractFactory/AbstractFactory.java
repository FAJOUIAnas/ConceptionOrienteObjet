package Factory.AbstractFactory;

import Factory.Catalogue.Vehicule;

public abstract class AbstractFactory {

    public Vehicule creerVoiture(String name, String model, int mat){
        return fabricateVoiture(name, model, mat);
    }

    protected abstract Vehicule fabricateVoiture(String name, String model, int mat);

    public Vehicule creerCamion(String name, String model, int mat){
        return fabricateCamion(name, model, mat);
    }

    protected abstract Vehicule fabricateCamion(String name, String model, int mat);
}
