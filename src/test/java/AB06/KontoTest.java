package AB06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto;

    @BeforeEach
    void setUp() {
        konto = new Konto(500.00);
    }

    @Test
    void einzahlen() {
        konto.einzahlen(500);
        assertEquals(1000,konto.getSaldo());
    }

    @Test
    void verzinsen() {
        konto.verzinsen(365);
        assertEquals(505,konto.getSaldo());
    }

    @Test
    void getSaldo(){
        assertEquals(500,konto.getSaldo());


    }
}