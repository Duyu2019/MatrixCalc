import java.util.Scanner;
public class MatrixCalc {
    private double[][] matrix;
    private double[][] matrix2;
    private double[][] matrix3;
    public MatrixCalc(int firstRow, int firstColumns, int secondRow, int secondColumns) {
        Scanner scan
    }
    public MatrixCalc(int rows, int columns) {
        matrix = new double[rows][columns];
        MatrixInitializer(matrix);
        matrix2 = new double[rows][columns];
        MatrixInitializer(matrix2);
        matrix3 = new double[rows][columns];
    }
    //If no length or row is specified, default to an empty(0) 2x2 matrix
    public MatrixCalc() {
        matrix = new double[2][2];
        MatrixInitializer(matrix);
        matrix2 = new double[2][2];
        MatrixInitializer(matrix2);
        matrix3 = new double[2][2];
        MatrixInitializer(matrix3);
    }
    //Initializes matrices with 0s.
    public void MatrixInitializer(double[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                matrix[row][columns] = 0;
                System.out.println(matrix[row][columns]);
            }
        }
    }

    /*public double[][] matrixEntry(int rows, int columns) {
        Scanner scan = new Scanner(System.in);
        matrix = new double[rows][columns];

    }*/
    public static void main(String[] args) {
        MatrixCalc test = new MatrixCalc(3,3);
    }
}
