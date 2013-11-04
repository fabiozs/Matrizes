package model;

/**
 *
 * @author fabio
 */
public class Matrix {

    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public int[] getRow(int num) {
        int[] result = new int[this.getCols()];
        System.arraycopy(this.matrix[num], 0, result, 0, this.getCols());
        return result;
    }

    public int[] getCol(int num) {
        int[] result = new int[this.getRows()];
        for (int i = 0; i < this.getRows(); i++) {
            result[i] = this.matrix[i][num];
        }
        return result;
    }

    public void setValue(int i, int j, int value) {
        this.matrix[i][j] = value;
    }

    public int getValue(int i, int j) {
        return this.matrix[i][j];
    }

    public Matrix add(Matrix other) {
        if (!(this.rows == other.getRows() && this.cols == other.getCols())) {
            return null;
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
            }
        }
        return result;
    }

    public Matrix subtract(Matrix other) {
        if (!(this.rows == other.getRows() && this.cols == other.getCols())) {
            return null;
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                result.setValue(i, j, this.getValue(i, j) - other.getValue(i, j));
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (!(this.cols == other.getRows())) {
            return null;
        }
        Matrix result = new Matrix(this.rows, other.getCols());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getCols(); j++) {
                result.setValue(i, j, this.dotProduct(this.getRow(i), other.getCol(j)));
            }
        }
        return result;
    }

    public int dotProduct(int[] v1, int[] v2) {
        int result = 0;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                result += this.getValue(i, j) + "\t";
            }
            result += "\n";
        }
        return result;
    }
}
