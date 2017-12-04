import org.junit.*;

public class ChildTest extends BaseTest{

    @BeforeClass
    public static void beforeClassChild() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Before
    public void beforeMethodChild() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @AfterClass
    public static void afterClassChild() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void afterMethodChild() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test1(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test2(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assert false;
    }
}
