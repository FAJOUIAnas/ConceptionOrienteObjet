import Factory.AbstractFactory.AbstractFactory;
import Factory.AbstractFactory.FabriqueElectrique;
import Factory.AbstractFactory.FabriqueHybride;
import Factory.Catalogue.Vehicule;
import Factory.FactoryMethod.FabriqueCamion;
import Factory.FactoryMethod.FabriqueVoiture;
import Factory.FactoryMethod.VehiculeFactory;
import Factory.Service.Entreprise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*List<Vehicule> vehicules = new ArrayList<>();



        VehiculeFactory vehiculeFactory = new FabriqueCamion();
        VehiculeFactory vehiculeFactory = FabriqueCamion.getInstance();

        vehicules.add(vehiculeFactory.creerVehicule("Camion1", "qwer", 123));
        vehicules.add(vehiculeFactory.creerVehicule("Camion2", "qwert", 1234));
        vehicules.add(vehiculeFactory.creerVehicule("Camion3", "qwerty", 12345));

        vehiculeFactory = FabriqueVoiture.getInstance();

        vehicules.add(vehiculeFactory.creerVehicule("Voiture1", "asdf", 987));
        vehicules.add(vehiculeFactory.creerVehicule("Voiture2", "asdfg", 9876));
        vehicules.add(vehiculeFactory.creerVehicule("CamioVoiture3", "asdfgh", 98765));

        System.out.println(vehicules);

        AbstractFactory absVehiculeFactory = new FabriqueElectrique();

        vehicules.add(absVehiculeFactory.creerVoiture("Voiture1", "asdf", 987));*/

        /*List<Vehicule> vehicules = new ArrayList<>();

        AbstractFactory factory = FabriqueElectrique.getInstance();

        vehicules.add(factory.creerCamion("anas", "hehe", 123));

        factory = FabriqueHybride.getInstance();


        vehicules.add(factory.creerVoiture("souhail", "jeje", 321));

        System.out.println(vehicules);*/

        Entreprise enter = new Entreprise();

        enter.setFac(FabriqueElectrique.getInstance());

        enter.createCamion("el hehe", "hehe", 123);

        enter.setFac(FabriqueHybride.getInstance());

        enter.createVoiture("el jeje", "jeje", 321);

        System.out.println(enter.vehicules);




    }
}