package ir.mtajik.abstractfactoryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.mtajik.abstractfactoryexample.factory.building.EnemyShipBuilder;
import ir.mtajik.abstractfactoryexample.factory.building.UFOEnemyShipBuilder;
import ir.mtajik.abstractfactoryexample.factory.EnemyShip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initilizeShip();
    }

    private void initilizeShip() {

        // EnemyShipBuilder handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilder MakeUFOs = new UFOEnemyShipBuilder();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");


    }
}
