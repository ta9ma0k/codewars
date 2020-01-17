package is_a_number_prime;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {

    @Test
    public void _2は素数と判定する() {
        assertTrue(Prime.isPrime(2));
    }

    @Test
    public void _3は素数と判定する() {
        assertTrue(Prime.isPrime(3));
    }

    @Test
    public void _4は素数でないと判定する() {
        assertFalse(Prime.isPrime(4));
    }

    @Test
    public void _1は素数でないと判定する() {
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void _0は素数でないと判定する() {
        assertFalse(Prime.isPrime(0));
    }

    @Test
    public void 負の値は素数でないと判定する() {
        assertFalse(Prime.isPrime(-1));
    }
}