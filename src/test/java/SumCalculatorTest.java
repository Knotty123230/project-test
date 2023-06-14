import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private static SumCalculator sumCalculator;

    public SumCalculatorTest() {
    }

    @BeforeEach
    public void init() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void sumSuccess() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void sumExceptionAccess() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}
