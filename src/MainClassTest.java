import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("Number 14 didnt return", getLocalNumber()==14);
    }
}
