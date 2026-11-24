


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void testGreeting() {
        assertEquals("Hello, World!", HelloWorld.getGreeting());
    }
}
