import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main=new Main();

    @Test
    void additional()
    {
        assertEquals(2,main.add(1,1));
    }
    @Test
    void difference()
    {
        assertEquals(1,main.diff(3,2));

    }
    void Multiplication()
    {
        assertEquals(1,main.Mult(2,5));
    }
    /*  void division()
    {
        assertEquals(1,main.div(3,6));
    }*/
}
