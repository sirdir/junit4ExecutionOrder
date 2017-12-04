import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class BaseTest {


    @BeforeClass
    public static void beforeClassParent() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Before
    public void beforeMethodParent() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @AfterClass
    public static void afterClassParent() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @After
    public void afterMethodParent() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Rule
    public TestWatcher testArtifacts = new org.junit.rules.TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description){
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }


        @Override
        protected void finished(Description description) {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        @Override
        protected void starting(Description description) {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    };
}
