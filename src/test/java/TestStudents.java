import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStudents {
    @Test
    public void StudentsTest() {
        Students students = Students.getInstance();
        for (Student x : students.studentsArray) {
            Assertions.assertTrue(x.getId() == 6065L || x.getId() == 6954L || x.getId() == 6090L);


        }
    }
}