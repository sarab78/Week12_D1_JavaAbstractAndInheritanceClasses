import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestStudent {

    Student student;

    @Before
    public void setup(){
        student = new Student("Sara", "G8", "Java");
    }

    @Test
    public void canGetName(){
        assertEquals("Sara", student.getName());
    }



    @Test
    public void canGetCohort(){
        assertEquals("G8", student.getCohort());

    }

    @Test
   public void canChangeName(){
        student.setName("Saru");
        assertEquals("Saru", student.getName());
    }

    @Test
    public void canchangeCohort(){
    student.setCohort("G6");
    assertEquals("G6", student.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love learning Java", student.talk());
    }



}
