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
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "69420666";
        boolean expResult = false;
        boolean result = isNumeric.isNumeric(str);
        assertEquals(expResult, result);
    }
    
}
