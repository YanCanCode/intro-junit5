package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll only gets called one time..................");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Clean object before each test..................");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Steve"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Another Test"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear down after each.................");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll only called once after all tests are done................");
    }
}