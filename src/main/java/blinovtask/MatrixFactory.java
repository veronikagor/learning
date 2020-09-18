package blinovtask;


/* пример # 7 : класс-создатель матрицы : MatrixFactory.java */
public class MatrixFactory {
    public static Matrix createRandomized(int n) {
        Matrix matrix = new Matrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix.setElement(i, j, (int) (Math.random() * n * n));
            }
        }
        return matrix;
    }
}

//public class MultipleException extends Exception {}



