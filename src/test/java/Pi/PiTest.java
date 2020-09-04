package Pi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PiTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void calculate() {
        assertEquals(Math.PI,Pi.calculate(),0.001);


    }
}