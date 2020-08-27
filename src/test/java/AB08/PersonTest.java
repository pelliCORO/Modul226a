package AB08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    @BeforeEach
    void setUp() {
        person = new Person("Michael","Pellicoro");

    }

    @Test
    void getFirstName() {
        assertEquals("Michael",person.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Pellicoro",person.getLastName());
    }
}