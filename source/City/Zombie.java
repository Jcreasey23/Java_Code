package source.City;

/**
 * This class models a Zombie which extends Person by technicality
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/

public class Zombie extends Person {


    public Zombie(String name, String photo) {
        super(name, photo);
    }

    /**
     * Initializes a new Zombie with given name
     * @param name specifies the name of the person becoming a Zombie
     */
    public Zombie(String name) {
        super(name);
    }

    /* (non-Javadoc)
     * @see HW2.City.Person#speak()
     */
    @Override
    Person speak() {
        System.out.println("ARRNNGGGHHHH...");
        System.out.println("BRRAAAAAIIIINNSSSSSS... ~ CRUNCH! ~");
        System.out.println("Congratulations! You have been bitten by a zombie and are now too a zombie... Nice work?");
        System.out.println("What was your name before you became an undead monstrosity?");
        //String name = userIn.next();
        
        Zombie undead_User = new Zombie(name);
        System.out.println("Best of luck to you in the city " + name + "! You will have to figure out on your own from here.");
        return undead_User;
        
    }
    
}
