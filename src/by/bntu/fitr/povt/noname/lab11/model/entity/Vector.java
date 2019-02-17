package by.bntu.fitr.povt.noname.lab11.model.entity;

import java.util.Arrays;

public class Vector {
    private double[] elements;

    public Vector(double... elements) {
        this.elements = elements;
    }

    public double[] getElements() {
        return elements;
    }

    public void setElements(double[] elements) {
        if (elements != null){
            this.elements = elements;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(elements, vector.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
