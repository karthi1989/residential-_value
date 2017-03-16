package sample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karthi
 */
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class TestJunit1 {
   @Test
   public void testAdd() {
      //test data
      double num = 50;
      String temp = null;
      String str = "Junit is working fine";
      List<Integer> actual = Arrays.asList(2,2,46,1,2,3,3,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,33,20,25,27);
      List<Integer> expected = Arrays.asList(2,2,46,1,2,3,3,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,33,20,25,27);

      //check for equality
      assertEquals("Junit is working fine", str);
      
      //check for false condition
      assertFalse(num > 52 || num < 49.9);

      //check for not null value
      assertNotNull(str);
      
      //1. Test equal.
      assertThat(actual, is(expected));
   }
   
}
