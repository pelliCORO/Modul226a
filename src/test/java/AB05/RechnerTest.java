package AB05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {

    Rechner calculator;

    @BeforeEach
    void setUp() {
        calculator = new Rechner();
    }

    @Test
    void calc() {
        calculator.setOpp(1);
        calculator.setZahl1(10);
        calculator.setZahl2(5);

        assertEquals(15,calculator.calc());
    }
}