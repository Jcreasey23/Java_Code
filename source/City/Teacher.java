package source.City;

/**
 * This class models a Teacher which extends Person
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public class Teacher extends Person{

    public Teacher(String name, String photo) {
        super(name, photo);
    }

    /**
     * Initializes the Teacher with the given name
     * @param name  specifies the name of the Teacher
     */
    public Teacher(String name) {
        super(name);
    }

    /**
     * Default Constructor for Teacher
     */
    public Teacher() {
    }

    /* (non-Javadoc)
     * @see HW2.City.Person#speak()
     */
    @Override
    Person speak() {
        System.out.println("Hello, my name is " + this.name);
        System.out.println("The children love the books...");
        return this;
        
    }
    
}
