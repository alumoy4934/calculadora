package com.carlosmoyano.calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraApplicationTest {
    private calculadora calculadora = new calculadora();

    @Test
    public void testSum(){
        assertEquals(5, calculadora.sum(2,3));
    }

  
}