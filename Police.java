package HW3.source.City;


/**
 * This class models a Police Officer which extends Person
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public class Police extends Person{

    public Police(String name, String photo) {
        super(name, photo);
    }

    /**
     * Initialize the Police Officer with the given name
     * @param name specifies the name of the Police Officer
     */
    public Police(String name) {
        super(name);
    }

    /**
     * Default Constructor for Police
     */
    public Police() {
    }

    /* (non-Javadoc)
     * @see HW2.City.Person#speak()
     */
    @Override
    Person speak() {
        System.out.println("Hello, my name is " + this.name);
        System.out.println("Stop Robbing the Old Ladies!");
        return this;
        
    }
    
}
