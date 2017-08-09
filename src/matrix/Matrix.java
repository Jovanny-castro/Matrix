
package matrix;
import java.util.Random;

public class Matrix {
 public static void main(String[] args) {
   StdOut.println("D");
        StdOut.println("--------------------");
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        StdArrayIO.print(d);
        StdOut.println();

        StdOut.println("I");
        StdOut.println("--------------------");
        double[][] c = matrix1.identity(5);
        StdArrayIO.print(c);
        StdOut.println();

        StdOut.println("A");
        StdOut.println("--------------------");
        double[][] a = matrix1.random(5, 5);
        StdArrayIO.print(a);
        StdOut.println();

        StdOut.println("A^T");
        StdOut.println("--------------------");
        double[][] b = matrix1.transpose(a);
        StdArrayIO.print(b);
        StdOut.println();

        StdOut.println("A + A^T");
        StdOut.println("--------------------");
        double[][] e = matrix1.add(a, b);
        StdArrayIO.print(e);
        StdOut.println();

        StdOut.println("A * A^T");
        StdOut.println("--------------------");
        double[][] f = matrix1.multiply(a, b);
        StdArrayIO.print(f);
        StdOut.println();
    }
    
}
