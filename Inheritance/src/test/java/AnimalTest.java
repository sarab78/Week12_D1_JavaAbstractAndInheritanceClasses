import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;


    @Before
    public void setUp(){
      animal = new Animal();

    }

    @Test
    public void animalCanEat(){
        assertEquals("eating noises", animal.eat());
    }

    @Test
    public void animalCanBreathe(){
        assertEquals("breathing noises", animal.breathe());
    }


}
