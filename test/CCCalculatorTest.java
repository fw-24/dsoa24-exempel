import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CCCalculatorTest {

    @Test
    void testTwoFactorMultiply() {
        CCCalculator calc = new CCCalculator();
        assertEquals(15, calc.multiply(3, 5));
    }
    @Test
    void testThreeFactorMultiply() {
        CCCalculator calc = new CCCalculator();
        assertEquals(150, calc.multiply(3, 5, 10));
    }

}