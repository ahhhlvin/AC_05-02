package nyc.c4q.ahhhlvin;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Ship ship0 = new Ship("Ship", "1992");
        Ship ship1 = new CruiseShip("Cruise", 100);
        Ship ship2 = new CargoShip("Cargo", 50);

        Ship[] shipArray = {ship0, ship1, ship2};

        for (Ship ship : shipArray) {
            System.out.println(ship.toString());
        }

    }
}
