import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("getClassNumber lower or equal 45", getClassNumber()>45);
    }
}
