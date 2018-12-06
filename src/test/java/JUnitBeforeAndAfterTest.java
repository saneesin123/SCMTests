import org.junit.*;

public class JUnitBeforeAndAfterTest {

    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("Before Class");
    }
    @Before
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void this1Test() {
        System.out.println("This is 1 test");
    }

    @Test
    public void this2Test() {
        System.out.println("This is 2 test");
    }

    @Test
    public void this3Test() {
        System.out.println("This is 3 test");
    }
    @After
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterClass
    public static void AfterClassTest(){
        System.out.println("After Class");
    }
}
