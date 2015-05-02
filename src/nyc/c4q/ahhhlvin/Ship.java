package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 5/2/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Ship
{

    // "protected" will allow the minimum access to be allowed throughout the family/hierarchy of ships
    protected String name;
    protected String yearBuilt;


    public Ship() {
    }

    public Ship(String name) {
        this.name = name;
    }

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;

    }


    public String getName() {
        return this.name;
    }


    public String setName() {
        return this.name = name;
    }


    public String getYear() {
        return this.yearBuilt;
    }


    public void setYear(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }


    public String toString() {
        return "My name is: " + this.name + ", and the year I was built was: " + this.yearBuilt;
    }


}
