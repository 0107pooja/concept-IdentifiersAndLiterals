import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloodGroupTest {

    @Test
    public void testValidBloodGroup(){
        BloodGroup group =new BloodGroup();
        String expectedBloodGroup="A+";

        String actualBloodGroup=group.getBlood("A+");
        assertEquals(expectedBloodGroup, actualBloodGroup);
    }

}