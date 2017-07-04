package ir.mtajik.abstractfactoryexample.factory.building;

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

import ir.mtajik.abstractfactoryexample.factory.UFOBossEnemyShip;
import ir.mtajik.abstractfactoryexample.factory.UFOEnemyShip;
import ir.mtajik.abstractfactoryexample.factory.EnemyShip;
import ir.mtajik.abstractfactoryexample.factory.EnemyShipFactory;
import ir.mtajik.abstractfactoryexample.factory.UFOBossEnemyShipFactory;
import ir.mtajik.abstractfactoryexample.factory.UFOEnemyShipFactory;

public class UFOEnemyShipBuilder extends EnemyShipBuilder {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO
        // needs. The EnemyShip object is returned & given a name

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else

            // If UFO BOSS was sent grab use the factory that knows
            // what types of weapons and engines a Boss UFO
            // needs. The EnemyShip object is returned & given a name

            if(typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");

            }

        return theEnemyShip;
    }
}
