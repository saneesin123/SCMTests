import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class junitExTest {
    @Before
    public void printBefore() {
        System.out.println("Before test");
    }

    @BeforeClass
    public static void printBeforeClass() {
        System.out.println("BeforeClass test");
    }

    @Test
    public void junitAssertTrueTest() {
        System.out.println("I am here at assertTrue");
        assertTrue(true);
    }

    @Test
    public void junitAssertFalseTest() {
        System.out.println("I am here at assertFalse");
        assertFalse(false);
    }

    @Test
    public void junitAssertEqualsTest() {
        System.out.println("I am here at assertEquals");
        assertEquals("both nos are equal", 5, 5);
    }

    @AfterClass
    public static void printAfterClassTest() {
        System.out.println("Afterclass test");
    }

    @After
    public void printAfterTest() {
        System.out.println("After test");
    }

}


