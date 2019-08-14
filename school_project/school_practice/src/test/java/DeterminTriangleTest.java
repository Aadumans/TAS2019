import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class DeterminTriangleTest {

    @Test
    public void determinIsTriangleReal() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Yes", DeterminTriangle.triangleExists(5, 5, 5));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(0, 1, 1));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(1, 0, 1));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(1, 1, 0));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(1, 0, 0));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(0, 1, 0));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(0, 0, 1));
        softAssert.assertEquals("No",  DeterminTriangle.triangleExists(0, 0, 0));
        softAssert.assertAll();
    }
}