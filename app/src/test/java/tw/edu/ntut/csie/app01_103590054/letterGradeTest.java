package tw.edu.ntut.csie.app01_103590054;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGradeTest {
    private letterGrade lg;

    @Before public void setUp(){
        lg = new letterGrade();
    }

    @After
    public void tearDown(){
        lg = null;
    }

    @Test
    public void testletterGrade() {
        assertEquals("X", lg.letterGrade(105));
        assertEquals("A", lg.letterGrade(95));
        assertEquals("B", lg.letterGrade(80));
        assertEquals("C", lg.letterGrade(77));
        assertEquals("D", lg.letterGrade(69));
        assertEquals("F", lg.letterGrade(5));
        assertEquals("X", lg.letterGrade(-1));
    }

}
