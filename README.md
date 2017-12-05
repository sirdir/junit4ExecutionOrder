Aim of this project to see in what order runs @BeforeClass, @Before and overrided methods (starting(), finished(), failed(), succeeded()) of @Rule org.junit.rules.TestWatcher()

start with <code>mvn test</code>

there are two test ("test1" will pass and "test2" will fail)

<strong>expected result is:</strong>
* Running ChildTest
* beforeClassParent
* beforeClassChild
* starting
* beforeMethodParent
* beforeMethodChild
* test1
* afterMethodChild
* afterMethodParent
* succeeded
* finished
* starting
* beforeMethodParent
* beforeMethodChild
* test2
* afterMethodChild
* afterMethodParent
* failed
* finished
* afterClassChild
* afterClassParent
