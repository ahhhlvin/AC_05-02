package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 5/2/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class CruiseShip extends Ship
{
    private int MaxPassengers;

    public CruiseShip() {
    }

    public CruiseShip(String name, int maxP) {
        // need to have a constructor in the superclass that takes ONLY 'String name'
        super(name);
        this.MaxPassengers = maxP;
    }


    public int getMaxPassengers() {
        return this.MaxPassengers;
    }

    @Override
    public String toString() {
        return "My name is: " + this.name + ", and the max number of passengers I can hold is:  " + this.MaxPassengers;
    }


}
