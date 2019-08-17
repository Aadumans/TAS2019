import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiersTest {

    @Test
    public void test () {
        Modifiers1 proga = new Modifiers1();

        assertEquals(12, proga.add(6,6));
    }

    @Test
    public void test2 (){
        assertEquals(12,Modifiers1.divide(144,12));
    }
}
