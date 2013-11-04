package main;

import model.Matrix;

/**
 *
 * @author fabio
 */
public class MultTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        m1.setValue(0, 0, 5);
        m1.setValue(0, 1, -2);
        m1.setValue(1, 0, -1);
        m1.setValue(1, 1, 7);
        Matrix m2 = new Matrix(2, 3);
        m2.setValue(0, 0, 3);
        m2.setValue(0, 1, 4);
        m2.setValue(0, 2, 1);
        m2.setValue(1, 0, 1);
        m2.setValue(1, 1, -5);
        m2.setValue(1, 2, 0);
        Matrix m3 = m1.multiply(m2);
        System.out.println("Multiplication:\n" + m3);
//        int[] x = {1, 2, 3};
//        int[] y = {-1, -2, -3};
//        //System.out.println("Vector product: " + m1.dotProduct(x, y));
//        int[] vec = m2.getCol(1);
//        for (int val : vec) {
//            System.out.print(val + " ");
//        }    
    }
}
