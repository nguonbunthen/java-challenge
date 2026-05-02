import java.util.Scanner;

public class ex13 {
    static class Matrix {
        int rows;
        int columns;
        int[][] elements;

        Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;
            elements = new int[rows][columns];
        }

        void setElement(int row, int column, int value) {
            elements[row][column] = value;
        }

        void printMatrix() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(elements[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        Matrix matrix = new Matrix(rows, columns);

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix.setElement(i, j, sc.nextInt());
            }
        }

        System.out.println("Matrix:");
        matrix.printMatrix();
        sc.close();
    }
}
