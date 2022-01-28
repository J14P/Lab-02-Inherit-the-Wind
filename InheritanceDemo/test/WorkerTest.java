import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest extends Person {

    Worker w1;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Tom", "Thompsom", "Mr.", 1963, 10);
    }

    @Test
    void testSetID() {
        w1.setID("00000A");
        assertEquals("00000A", w1.getID());
    }

    @Test
    void testSetTitle() {
        w1.setTitle("Ms.");
        assertEquals("Ms.", w1.getTitle());
    }

    @Test
    void testSetFirstName() {
        w1.setFirstName("Jackson");
        assertEquals("Jackson", w1.getFirstName());
    }

    @Test
    void testSetLastName() {
        w1.setLastName("Pinchot");
        assertEquals("Pinchot", w1.getLastName());
    }

    @Test
    void testSetYOB() {
        w1.setYOB(1999);
        assertEquals(1999, w1.getYOB());
    }

    @Test
    void testGetFullName() {
        assertEquals("Tom Thompsom", w1.getFullName());
    }

    @Test
    void testFormalName() {
        assertEquals("Mr. Tom Thompsom", w1.formalName());
    }

    @Test
    void testGetAge() {
        assertEquals(59, w1.getAge());
    }

    @Test
    void testGetAge1() {
        assertEquals(37, w1.getAge(2000));
    }

    @Test
    void testToCSVDataRecord() {
        assertEquals("000001, Tom, Thompsom, Mr., 1963", w1.toCSVDataRecord());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID= '000001', firstName= 'Tom', lastName= 'Thompsom', YOB= 1963}", w1.toString());
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(25);
        assertEquals(25, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(40);
        assertEquals(400, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        w1.displayWeeklyPay(40);
        assertEquals("Mr. Tom Hours Worked: 40.0 Pay: $400.0 Overtime Hours: 0 Total Pay: 400.0", w1.displayWeeklyPay(40));
    }
}