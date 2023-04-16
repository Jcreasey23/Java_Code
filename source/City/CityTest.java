package source.City;

public class CityTest {
    /**
     * CityTest allows the user to meet all members of society dwelling in the city
     * This process is an interactive experience where the user can choose their own adventure
     * @param args
     */
    public static void main(String[] args){
        // Create a city
        City atlantis = new City();

        atlantis.phrases.add("Howdy partner! What lovely weather we are having today!");
        atlantis.phrases.add("Don't drink the water here... it does things to people.");
        atlantis.phrases.add("You should make sure to stop by the musem of dark alleys");
        atlantis.phrases.add("Did you bring any protective equiptment? You might want some");
        atlantis.phrases.add("Trust no one... well you can trust me");
        atlantis.phrases.add("Did you know that Java is a super cool language that allows you to do some awesome things!");
        atlantis.phrases.add("Feel free to just walk into stores and take things without paying. That's kind of where we are at here.");


        // And we will add people to the city
        // Create some residents to visit!
        atlantis.addResident(new Citizen("Jar-Jar Binks"));      // new Citizen
        atlantis.addResident(new Citizen("Freddie Mercury"));    // new Citizen
        atlantis.addResident(new Kid("Boss Baby"));              // new Kid
        atlantis.addResident(new Police("DareDevil"));           // New Police
        atlantis.addResident(new Teacher("Princess Peach"));     // New Teacher
        atlantis.addResident(new Zombie("Dr. Eat Your Brains")); // New Zombie
        atlantis.addResident(new Citizen("Test - Test - Test")); // New Test Citizen
        
        System.out.println("Welcome to the city Atlantis! Let our citizens introduce themselves!");
        atlantis.tourResidents();   // Introduce Residents in "game" fashion

        
    }
    
}
