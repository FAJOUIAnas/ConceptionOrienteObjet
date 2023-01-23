package Factory.FactoryMethod;

import Factory.Catalogue.Vehicule;

public abstract class VehiculeFactory {

    public Vehicule creerVehicule(String name, String model, int mat){
        return fabricateVehicule(name, model, mat);
    }

    protected abstract Vehicule fabricateVehicule(String name, String model, int mat);
}
