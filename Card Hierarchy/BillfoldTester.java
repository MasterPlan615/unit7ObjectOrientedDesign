
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class BillfoldTester
{
    public BillfoldTester()
    {
    }

    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void BillfoldTest()
    {
        Billfold wallet = new Billfold();
        DriverLicense license = new DriverLicense("Andrew","15",2005);
        IDCard id = new IDCard("Andrew","56383");
        wallet.addCard(license);
        wallet.addCard(id);
        System.out.print(wallet.formatCards());
    }
    
    @Test
    public void BillfoldTest2()
    {
        Billfold wallet = new Billfold();
        CallingCard call = new CallingCard("Andrew","6306316546");
        DriverLicense license = new DriverLicense("Andrew","15",2005);
        wallet.addCard(call);
        wallet.addCard(license);
        System.out.println(wallet.getExpiredCardCount());
    }
}
