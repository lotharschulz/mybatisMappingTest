package info.lotharschulz.mybatisMappingTest01;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThingsMapperTest {
    private static final Logger log = Logger.getLogger(ThingsMapperTest.class);
    private static ThingsDAO imageDAO;

    @BeforeClass
    public static void setUp() throws Exception {
        log.info("starting up myBatis test");
        imageDAO = new ThingsDAO();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        log.info("closing down myBatis tests");
    }

    @Test
    public void selectAll() throws Exception {
        log.debug("selectAll");
        List<Things> thingslist = imageDAO.selectAll();
        log.debug("thingslist: " + thingslist);
        String expected = "[Things{ID=1, stuff=null, prop2=some string, column_one=10, someotherprop=0}, Things{ID=2, stuff=null, prop2=some other string, column_one=2, someotherprop=0}]";
        Assert.assertEquals(thingslist.toString().trim(), expected.trim());
    }
    
}
