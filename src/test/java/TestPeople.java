import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestPeople {

    private People people;
    private Person person1;
    private Person person2;

    @BeforeEach
    public void setUp() {
        people = new People();
        person1 = new Person("Alice");
        person2 = new Person("Bob");
    }

    @Test
    public void testAdd() {
        people.add(person1);

        assertTrue("PersonList should contain person1 after adding", people.getPersonList().contains(person1));
     }

    @Test
    public void testRemove() {
        people.add(person1);
        people.add(person2);

        people.remove(person1);

        assertFalse("PersonList should not contain person1 after removal", people.getPersonList().contains(person1));
     }

    @Test
    public void testFindById() {
        people.add(person1);
        people.add(person2);

        assertEquals(person1, people.findById(1), "findById should return person1 for id 1");
        assertEquals(person2, people.findById(2), "findById should return person2 for id 2");
        assertNull(people.findById(3), "findById should return null for a non-existent id");
    }
}