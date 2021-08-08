package de.gilmoh.matrix;

import java.util.Arrays;

public class Vector{
    private double[] vector;

    public Vector(double ... vector) {
        this.vector = vector;
    }

    public static Vector add(Vector a, Vector b) {
        if (a.vector.length!=b.vector.length) {
            throw new RuntimeException("Falsche Dimension!!!");
        }
        double[] tmp = new double[a.vector.length];
        for (int i = 0; i<tmp.length;i++) {
            tmp[i] = a.vector[i] + b.vector[i];
        }
        return new Vector(tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector1 = (Vector) o;
        return Arrays.equals(vector, vector1.vector);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vector);
    }

    @Override
    public String toString() {
        return "Vector{" + Arrays.toString(vector) + '}';
    }
}
