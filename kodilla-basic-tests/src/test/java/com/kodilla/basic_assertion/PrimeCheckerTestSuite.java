import com.kodilla.basic_assertion.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void testIsPrimeForPrimeNumber() {
        assertTrue(primeChecker.isPrime(13));
    }

    @Test
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(primeChecker.isPrime(14));
    }

    @Test
    public void testIsPrimeForEdgeCases() {
        assertFalse(primeChecker.isPrime(1));
        assertFalse(primeChecker.isPrime(0));
        assertFalse(primeChecker.isPrime(-6));
        assertTrue(primeChecker.isPrime(2));
    }
}