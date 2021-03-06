package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 18/06/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Conf.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class TaxServiceTest {
    @Autowired
    private TaxService taxService;

    @Test
    public void testGetTax() throws Exception {
        Assert.assertEquals(20,taxService.getTax());
    }
}