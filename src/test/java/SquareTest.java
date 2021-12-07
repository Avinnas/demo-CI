import com.company.MyMath;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Before
    public void setUp() {
        var o = new MyMath();
        System.out.println("starting tests");
    }

    @Test
    void demoTestMethod() {
        assertEquals(100, MyMath.square(10));
        assertEquals(4, MyMath.square(2));
        assertEquals(1, MyMath.square(-1));
        assertEquals(152399025, MyMath.square(-12345));
    }
}
