import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    void getInstance() {
        Students test = Students.getInstance();
        Person actual = test.findById(0);
        Person expected = test.getPersonList().get(0);

        Assert.assertEquals(expected, actual);
    }
}
