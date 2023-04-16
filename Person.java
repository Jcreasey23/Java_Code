package HW3.source.City;


/**
 * This class models a Person of which has a name and can speak
 * @author Josh Creasey
 * @version 1.00, 06 January 2023
*/
public abstract class Person{
    String name;
    String photo_loc;

    public Person(String name, String photo) {
        this.name = name;
        this.photo_loc = photo;
    }

    public String getPhoto() {
        return photo_loc;
    }

    public void setPhoto(String photo) {
        this.photo_loc = photo;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public Person() {
    }

    /**
     * @return
     */
    abstract Person speak();

    

}