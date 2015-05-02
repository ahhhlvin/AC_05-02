package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 5/2/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class CargoShip extends Ship
{
    private int tonnage;


    public CargoShip() {
    }

    public CargoShip(String name, int tonnage) {
        super(name);
        this.tonnage = tonnage;

    }

    public int getTonnage() {
        return this.tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }


    public String toString() {
        return "My name is: " + this.name + ", and my tonnage is: " + this.tonnage;
    }


}
