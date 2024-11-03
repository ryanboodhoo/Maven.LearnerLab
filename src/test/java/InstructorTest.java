import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    private Instructor instructor;
    private Student student1;
    private Student student2;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor(1, "Dr. Smith");
        student1 = new Student( "Alice");
        student2 = new Student("Bob");
    }

    @Test
    public void testImplementation() {
        assertTrue(instructor instanceof Teacher, "Instructor should be an instance of Teacher");
    }

    @Test
    public void testInheritance() {
        assertTrue(instructor instanceof Person, "Instructor should be an instance of Person");
    }

    @Test
    public void testTeach() {
        int numberOfHours = 5;
        int initialStudyTime = (int) student1.getTotalStudyTime();

        instructor.teach(student1, numberOfHours);

        assertEquals(initialStudyTime + numberOfHours, student1.getTotalStudyTime(),
                "Student's totalStudyTime should be incremented by the specified numberOfHours");
    }

    @Test
    public void testLecture() {
        Student[] students = {student1, student2};
        int numberOfHours = 10;

        int initialStudyTime1 = (int) student1.getTotalStudyTime();
        int initialStudyTime2 = (int) student2.getTotalStudyTime();

        instructor.lecture(students, numberOfHours);

        int expectedIncrement = numberOfHours / students.length;

        assertEquals(initialStudyTime1 + expectedIncrement, student1.getTotalStudyTime(),
                "Student1's totalStudyTime should be incremented by numberOfHours/students.length");
        assertEquals(initialStudyTime2 + expectedIncrement, student2.getTotalStudyTime(),
                "Student2's totalStudyTime should be incremented by numberOfHours/students.length");
    }
}