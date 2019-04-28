package de.lv1871.cleancode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    public void testIt(){
        assertEquals(new Foo().greeting(), "Hello World");
    }


}