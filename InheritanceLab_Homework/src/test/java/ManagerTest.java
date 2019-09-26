import Staff.Management.Manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Sarab", "SK 34 56 78 J", 60000, "Finance" );
    }

    @Test
    public void hasName(){
        assertEquals("Sarab", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SK 34 56 78 J", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void hasIncreaseSalary(){
        manager.raiseSalary(1.05);
        assertEquals(63000, manager.getSalary(), 0.01);
    }



    @Test
    public void canGetBonus(){
        assertEquals(600, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Sara");
        assertEquals("Sara", manager.getName());
    }
}
