package de.gilmoh.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    void testAdd() {
        Vector a = new Vector(1,1,1);
        Vector b = new Vector(3,4,5);
        assertEquals(new Vector(4,5,6), Vector.add(a,b));
        assertNotEquals(new Vector(4,5,5), Vector.add(a,b));


        assertThrows(RuntimeException.class, () -> Vector.add(new Vector(1,2,3), new Vector(1,1)));
    }

    @Test
    void testToString() {
        assertEquals("Vector{[1.0, 2.0, 3.0]}", new Vector(1,2,3).toString());
    }
}
