package jar;

import static org.junit.Assert.assertTrue;
import jar.Calc;
import org.junit.Test;

public class TestCalc{
    
    @Test
    public void testadd()
    {
        assertTrue(Calc.add(3,2)==5);
    }
}

