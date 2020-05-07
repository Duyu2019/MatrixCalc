import java.util.Scanner;
public class MatrixCalc {
    private double[][] matrix;
    private double[][] matrix2;
    private double[][] matrix3;
    //Constructor for multiplication, usually for 2 matrices with different dimensions
    public MatrixCalc(int firstRow, int firstColumns, int secondRow, int secondColumns) {
       matrix = new double[firstRow][firstColumns];
       MatrixInitializer(matrix);
       matrix2 = new double[secondRow][secondColumns];
       MatrixInitializer(matrix2);
       matrix3 = new double[firstRow][secondColumns];
       MatrixInitializer(matrix3);
    }
    //Constructor for 2 matrices with the same dimensions
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
    public void MatrixFill(double[][] matrix) {
        Scanner scan = new Scanner(System.in);
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                System.out.println("Please enter the entry for row:" + row + " and column:" + columns);
                double input = scan.nextDouble();
                matrix[row][columns] = input;
                System.out.println(matrix[row][columns]);
            }
        }
    }
    public void add(double[][] matrix, double[][] matrix2) {
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                System.out.println("Please enter the entry for row:" + row + " and column:" + columns);
                matrix3[row][columns] = matrix[row][columns] + matrix2[row][columns];
                System.out.println(matrix3[row][columns]);
            }
        }
    }
    public void subtract(double[][] matrix, double[][] matrix2) {
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                matrix3[row][columns] = matrix[row][columns] - matrix2[row][columns];
                System.out.println(matrix3[row][columns]);
            }
        }
    }
    public void swap(double[][] matrix, double[][] matrix2) {
        double[][] copy = copy(matrix);
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                matrix[row][columns] = matrix2[row][columns];
                matrix2[row][columns] = copy[row][columns];
            }
        }
    }
    public double[][] copy(double[][] matrix) {
        double[][] copy = new double[matrix.length][matrix[0].length];
        for(int row = 0; row < matrix.length; row++) {
            for(int columns = 0; columns < matrix[row].length; columns++) {
                copy[row][columns] = matrix[row][columns];
                System.out.println(matrix3[row][columns]);
            }
        }
        return copy;
    }
    public void transpose(double[][] matrix) {
        double[][] transposed = new double[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix.length; row++) {
            for(int transColumn = 0; transColumn < transposed[0].length; transColumn++) {
                transposed[row][transColumn] = matrix[transColumn][row];
                System.out.println(transposed[row][transColumn]);
            }
        }
        matrix = transposed;
    }
    public double[][] multiply(double[][] matrix, double[][] matrix2) {
        int resultColumn = 0;
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[0].length; column++) {
                matrix3[row][resultColumn] += (matrix[row][column] * matrix2[column][row]);
            }
            resultColumn++;
            if(resultColumn > matrix[0].length - 1) {
                resultColumn = 0;
            }
        }
        return matrix3;
    }
    public static void main(String[] args) {
        MatrixCalc test = new MatrixCalc(3,3);
    }
}
