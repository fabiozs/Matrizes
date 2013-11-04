package main;

import model.Matrix;

/**
 *
 * @author fabio
 */
public class AddSubTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2,2);
        m1.setValue(0, 0, 5);
        m1.setValue(0, 1, -2);
        m1.setValue(1, 0, -1);
        m1.setValue(1, 1, 7);
        Matrix m2 = new Matrix(2,2);
        m2.setValue(0, 0, 3);
        m2.setValue(0, 1, 4);
        m2.setValue(1, 0, 1);
        m2.setValue(1, 1, -5);
        Matrix m3 = m1.add(m2);
        Matrix m4 = m1.subtract(m2);
        System.out.println("Addition:\n"+m3);
        System.out.println("Subtraction:\n"+m4);
    }
}
