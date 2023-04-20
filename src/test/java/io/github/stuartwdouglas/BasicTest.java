package io.github.stuartwdouglas;

import org.coollibrary.DoCoolStuff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    public void basicTest() {
        Assertions.assertEquals("Hello", DoCoolStuff.sayHello());
    }
}
