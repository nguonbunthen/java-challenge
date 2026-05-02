public class ex14 {
    static class Matrix {
        int rows;
        int columns;
        int[][] elements;

        Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;
            elements = new int[rows][columns];
        }

        int getRows() {
            return rows;
        }

        int getColumns() {
            return columns;
        }

        void setElement(int row, int column, int value) {
            elements[row][column] = value;
        }

        Matrix add(Matrix other) {
            if (rows != other.rows || columns != other.columns) {
                System.out.println("Matrices cannot be added");
                return null;
            }

            Matrix result = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.elements[i][j] = elements[i][j] + other.elements[i][j];
                }
            }
            return result;
        }

        Matrix multiply(Matrix other) {
            if (columns != other.rows) {
                System.out.println("Matrices cannot be multiplied");
                return null;
            }

            Matrix result = new Matrix(rows, other.columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < other.columns; j++) {
                    for (int k = 0; k < columns; k++) {
                        result.elements[i][j] += elements[i][k] * other.elements[k][j];
                    }
                }
            }
            return result;
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
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);

        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        System.out.println("Rows in matrix 1: " + matrix1.getRows());
        System.out.println("Columns in matrix 1: " + matrix1.getColumns());

        Matrix sum = matrix1.add(matrix2);
        if (sum != null) {
            System.out.println("Addition result:");
            sum.printMatrix();
        }

        Matrix product = matrix1.multiply(matrix2);
        if (product != null) {
            System.out.println("Multiplication result:");
            product.printMatrix();
        }
    }
}
