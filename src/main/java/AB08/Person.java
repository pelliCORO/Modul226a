package AB08;

/**
 * Representation einer Person
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * Erstellen einer neuen Person
     *
     * @param firstName Vorname
     * @param lastName  Nachname
     */
    public Person(String firstName, String lastName) {

        firstName = firstName;
        lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}







