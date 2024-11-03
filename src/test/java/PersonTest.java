import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    private final int id = 1;
    private final String initialName = "John Doe";

    @BeforeEach
    public void setUp() {
        person = new Person(initialName);
    }

    @Test
    public void testConstructor() {
        assertEquals(id, person.getId(), "Person's id should be set upon construction");
        assertEquals(initialName, person.getName(), "Person's name should be set upon construction");
    }

    @Test
    public void testSetName() {
        String newName = "Jane Doe";
        person.setName(newName);
        assertEquals(newName, person.getName(), "Person's name should be updated by setName method");
    }
}