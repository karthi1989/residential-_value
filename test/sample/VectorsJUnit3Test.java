/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.TestCase;

/**
 *
 * @author nb
 */
public class VectorsJUnit3Test extends TestCase {

    public VectorsJUnit3Test(String testName) {
        super(testName);
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    public void testScalarMultiplication() {
        System.out.println("* VectorsJUnit3Test: testScalarMultiplication()");
        // IN MATTAKKULIYA JUNCTION
        assertEquals(0, Vectors.scalarMultiplication(new double[]{0, 0}, new double[]{0, 0}));
        assertEquals(50, Vectors.scalarMultiplication(new double[]{2,2,46,1,2,3,3,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,33,20,25,27}, new double[]{0, 23, 0, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.05, 0.05, 0.05, 0.05}));
        assertEquals(326, Vectors.scalarMultiplication(new double[]{2,14,322,1,2,6,3,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,33,30,27,32}, new double[]{0, 23, 0, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.05, 0.05, 0.05, 0.05}));
        
        //IN SLUM AREA WITH LOWEST LAND VALUE
        assertEquals(22, Vectors.scalarMultiplication(new double[]{2,2,46,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,28,30,28,27}, new double[]{0, 9, 0, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.05, 0.05, 0.05, 0.05}));
    }
}

