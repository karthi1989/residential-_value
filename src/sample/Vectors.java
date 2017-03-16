/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

/**
 * Sample utility class for vector algebra.
 *
 * @author  nb
 */
public final class Vectors {

    private Vectors() {}

    /**
     * Scalar multiplication of given vectors.
     */
    public static int scalarMultiplication(double[] a, double[] b) {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("null argument");
        }

        if (a.length != b.length) {
            throw new IllegalArgumentException(
                    "different tuple of the vectors ("
                    + a.length + ", " + b.length + ')');
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }
}