package HW3.source.City;


/**
 * This class models a Kid which extends Person
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public class Kid extends Person{

    public Kid(String name, String photo) {
        super(name, photo);
    }

    /**
     * Initialize the Kid object with given name
     * @param name specifies the name of the Kid
     */
    public Kid(String name) {
        this.name = name;
    }

    /**
     * Default Constructor for Kid
     */
    public Kid() {
    }

    /* (non-Javadoc)
     * @see HW2.City.Person#speak()
     */
    @Override
    Person speak() {
        System.out.println("Hello, my name is " + this.name);
        System.out.println("Daddy look! It's Spiderman swinging in the park!");
        return this;
        
    }
    
}
