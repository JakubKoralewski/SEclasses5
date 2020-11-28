/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsiwek
 */
public class isNumericTest {
    
    public isNumericTest() {
    }

    @Test
    public void testIsNumericWhenNumber() {
        System.out.println("isNumeric number");
        String str = "69420666";
        boolean expResult = true;
        boolean result = isNumeric.isNumeric(str);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNumericWhenEmpty() {
        System.out.println("isNumeric empty");
        String str = "";
        boolean expResult = false;
        boolean result = isNumeric.isNumeric(str);
        assertEquals(expResult, result);
    }
    
}
