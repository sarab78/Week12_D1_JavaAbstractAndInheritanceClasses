import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestInstructor {

    Instructor instructor;

    @Before
    public void setup(){
        instructor = new Instructor("Colin", "G13", "Java", "Ruby");
    }
    @Test
    public void hasModuleTeam(){
        assertEquals("Ruby", instructor.getModuleTeam());
    }



    @Test
    public void canGetName(){
        assertEquals("Colin", instructor.getName());
    }



    @Test
    public void canGetCohort(){
        assertEquals("G13", instructor.getCohort());

    }

    @Test
    public void canchangeName(){
    instructor.setName("Steve");
    assertEquals("Steve", instructor.getName());
    }

    @Test
    public void canChangeCohort(){
    instructor.setCohort("G8");
    assertEquals("G8", instructor.getCohort());
    }
    @Test
    public void canTalk() {
        assertEquals("I love Java", instructor.talk());

    }

    @Test
    public void canSetModuleTeam() {
        instructor.setModuleTeam("Ruby");
        assertEquals("Ruby", instructor.getModuleTeam());
    }
}


