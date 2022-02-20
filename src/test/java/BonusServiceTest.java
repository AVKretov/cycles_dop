import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    @DisplayName("😱")
    void testFromFile( long amount, boolean registred, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registred);

        assertEquals(expected, actual);
    }

}