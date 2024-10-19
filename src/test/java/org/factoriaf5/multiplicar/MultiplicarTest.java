package org.factoriaf5.multiplicar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicarTest {

    @Test
    public void testMultiplicar() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Multiplicar multiplicar = new Multiplicar();
        multiplicar.multiplicar(5);

        String[] outputLines = outContent.toString().split(System.lineSeparator());

        assertEquals("5 x 1 = 5", outputLines[0]);
        assertEquals("5 x 2 = 10", outputLines[1]);
        assertEquals("5 x 3 = 15", outputLines[2]);
        assertEquals("5 x 4 = 20", outputLines[3]);
        assertEquals("5 x 5 = 25", outputLines[4]);
        assertEquals("5 x 6 = 30", outputLines[5]);
        assertEquals("5 x 7 = 35", outputLines[6]);
        assertEquals("5 x 8 = 40", outputLines[7]);
        assertEquals("5 x 9 = 45", outputLines[8]);
        assertEquals("5 x 10 = 50", outputLines[9]);

        System.setOut(System.out);
    }

    @Test
    public void testMain() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {};
        Multiplicar.main(args);

        String[] outputLines = outContent.toString().split(System.lineSeparator());

        assertEquals("5 x 1 = 5", outputLines[0]);
        assertEquals("5 x 2 = 10", outputLines[1]);
        assertEquals("5 x 3 = 15", outputLines[2]);
        assertEquals("5 x 4 = 20", outputLines[3]);
        assertEquals("5 x 5 = 25", outputLines[4]);
        assertEquals("5 x 6 = 30", outputLines[5]);
        assertEquals("5 x 7 = 35", outputLines[6]);
        assertEquals("5 x 8 = 40", outputLines[7]);
        assertEquals("5 x 9 = 45", outputLines[8]);
        assertEquals("5 x 10 = 50", outputLines[9]);

        System.setOut(System.out);
    }
}