package HW3.source.City;


/**
 * This class models a Citizen which extends Person
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public class Citizen extends Person {

    public Citizen(String name, String photo) {
        super(name, photo);
    }

    /**
     * Initializes a Citizen with a given name
     * @param name specifies the name given to the Citizen
     */
    public Citizen(String name) {
        this.name = name;
    }

    /**
     * Default constructor for Citizen
     */
    public Citizen() {
    }

    /* (non-Javadoc)
     * @see HW2.City.Person#speak()
     */
    @Override
    Person speak() {
        System.out.println("Hello, my name is " + this.name);
        System.out.println("What a beautiful day! Surely nothing could go wrong...");
        return this;
    }
    
}
