package hello_world;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello World!", helloWorld.helloWorld());
    }
}
