/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittestexample;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lebogangmok
 */
public class CheckClassTest {
    
    public CheckClassTest() {
    }

    /**
     * Test of checkString method, of class CheckClass.
     */
    @Test
    public void testCheckString() {
        System.out.println("checkString");
        String myString = "Sam!";
        CheckClass instance = new CheckClass();
        boolean expResult = true;
        boolean result = instance.checkString(myString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sum method, of class CheckClass.
     */
    @Test
     public void testSum() {
        System.out.println("sum");
        int a = 7;
        int b = 5;
        CheckClass instance = new CheckClass();
        int expResult = 12;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
