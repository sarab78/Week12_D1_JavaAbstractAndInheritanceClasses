import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest  {

    Mammal mammal = new Mammal();


}

@Test
public void canEat(){
    assertEquals("eating noises", mammal.eat());
}
