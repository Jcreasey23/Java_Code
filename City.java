package HW3.source.City;
import java.util.Vector;

/**
 * This class models a City which holds people
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public class City {
    
    public Vector<Person> residents = new Vector<>();       // Vector contains all residents under the jurisdiction of the Person class
    public Vector<String> phrases = new Vector<>();
    //Scanner userIn = new Scanner(System.in);    // Scanner to interact with User's choice within the city limits

    

    /**
     * Add resident to the vector of known residents
     * @param p // acts as the new Person object being added to the vector
     */
    public void addResident(Person p){
        if(p == null){
            System.out.println("Null Object");
        }
        residents.add(p);
    }

    /**
     * Tour residents in the known residents vector
     * When User encounters an individual, the individual speaks to the user and asks if they would like to continue the tour
     * If the next user on the list is a Zombie and not your average Joe then the user will have the opportunity to escape
     * When the tour is complete, the user will have the option to go on the tour again
     * The user can exit the tour after meeting any normal resident
     */
    public void tourResidents(){
        String continueTour = "Y";
        while(continueTour.equals("Y")|| continueTour.equals("y")){
            //System.out.println("Would you like to continue the tour (Y = 1/N = 0)?");
            //continueTour = userIn.nextInt();
        
            for(int i = 0; i < residents.size(); i++){
                if(residents.get(i).getClass() != Zombie.class){        // if the current resident in the vector is not a Zombie continue as Normal and let them introduce themselves
                    residents.get(i).speak();                           // Causes current resident to Speak based on their type

                    System.out.println("Would you like to continue the tour (Y/N)?");   // Prompt user to continue
                    //continueTour = userIn.next();

                    if(continueTour.equals("N") || continueTour.equals("n")){
                        break;  // Exit Program if the user selects no
                    }
                    
                }else{
                    // This means a Zombie has been encountered by the user.
                    // This else statement allows the user to make a choice to survive the Zombie
                    System.out.println("Something seems off about the next resident... Do you still want to approach them? (Y/N)?");
                    //String response = userIn.next();

                    // If the user does not approach Zombie Congratulate them and continue tour
                    if(response.equals("N") || response.equals("n")){
                        System.out.println("Great call there traveller! That guy's walk was sketchier than a Scooby Doo Monster");
                        System.out.println("Would you like to continue the tour (Y/N)?");   // Prompt user to continue
                        //continueTour = userIn.next();
                    // If the user decides to talk to the Zombie... Well they will become a Zombie and the tour will end
                    }else if(response.equals("Y") || response.equals("y")){
                        residents.add(residents.get(i).speak());
                        continueTour = "N"; // Breaks While loop
                        break;  // Do not continue the tour... You're dead now. You'll figure it out as you go.
                    }
                }
            }
            // Only ask the user to play again if they are still alive after all introductions have been made
            if(continueTour.equals("Y") || continueTour.equals("y")){
                System.out.println("You have met all of our residents! Would you like to tour again (Y/N)?");
                //continueTour = userIn.next();
            }
        }
    }
    
}
