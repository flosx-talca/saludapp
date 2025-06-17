
package com.equipo.saludotest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testSaludo(){
        assertEquals("Hola DEVOPS!!", App.saludar("DEVOPS"));
    }
}
