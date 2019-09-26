import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    Person person;

    @Before
    public void before(){
        person = new Person("Sarab", "G13", "Java");


    }

    @Test
    public void hasName(){
        assertEquals("Sarab", person.getName());
    }

    @Test
            public void hasCohort(){
        assertEquals("G13", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("Shaun");
        assertEquals("Shaun", person.getName());
    }

    @Test
    public void personCanTalk(){
        assertEquals("I love Java", person.talk());
    }

}
