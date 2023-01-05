import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectAgeTest {

    @Test
    public void testValidAge(){
        PerfectAge perfectAge =new PerfectAge();
        int expectedAge=60;

        int actualAge= perfectAge.getPersonAge(60);
        assertEquals(expectedAge, actualAge);
    }

}