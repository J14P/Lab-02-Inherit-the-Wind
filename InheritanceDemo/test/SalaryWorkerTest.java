import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest extends Worker {

    SalaryWorker sWorker1;

    @BeforeEach
    void setUp() {
        sWorker1 = new SalaryWorker("000001", "Tom", "Thompsom", "Mr.", 1963, 10, 20800);
    }

    @Test
    void testSetID() {
        sWorker1.setID("00000A");
        assertEquals("00000A", sWorker1.getID());
    }

    @Test
    void testSetTitle() {
        sWorker1.setTitle("Ms.");
        assertEquals("Ms.", sWorker1.getTitle());
    }

    @Test
    void testSetFirstName() {
        sWorker1.setFirstName("Jackson");
        assertEquals("Jackson", sWorker1.getFirstName());
    }

    @Test
    void testSetLastName() {
        sWorker1.setLastName("Pinchot");
        assertEquals("Pinchot", sWorker1.getLastName());
    }

    @Test
    void testSetYOB() {
        sWorker1.setYOB(1999);
        assertEquals(1999, sWorker1.getYOB());
    }

    @Test
    void testGetFullName() {
        assertEquals("Tom Thompsom", sWorker1.getFullName());
    }

    @Test
    void testFormalName() {
        assertEquals("Mr. Tom Thompsom", sWorker1.formalName());
    }

    @Test
    void testGetAge() {
        assertEquals(59, sWorker1.getAge());
    }

    @Test
    void testGetAge1() {
        assertEquals(37, sWorker1.getAge(2000));
    }

    @Test
    void testToCSVDataRecord() {
        assertEquals("000001, Tom, Thompsom, Mr., 1963", sWorker1.toCSVDataRecord());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID= '000001', firstName= 'Tom', lastName= 'Thompsom', YOB= 1963}", sWorker1.toString());
    }

    @Test
    void setHourlyPayRate() {
        sWorker1.setHourlyPayRate(25);
        assertEquals(25, sWorker1.getHourlyPayRate());
    }

    @Test
    void testCalculateWeeklyPay1() {
        sWorker1.calculateWeeklyPay(40);
        assertEquals(400.0, sWorker1.calculateWeeklyPay(40));
    }

    @Test
    void testDisplayWeeklyPay1() {
        sWorker1.displayWeeklyPay(40);
        assertEquals("Mr. Tom Hours Worked: 40.0 Pay: $400.0 Total Pay (A fraction of the yearly salary) : 400.0", sWorker1.displayWeeklyPay(40));
    }

    @Test
    void setAnnualSalary() {
        sWorker1.setAnnualSalary(30000);
        assertEquals(30000, sWorker1.getAnnualSalary());
    }
}