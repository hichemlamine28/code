/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hichem
 */
public class ObjectMapperTest {
    
    public ObjectMapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readValue method, of class ObjectMapper.
     */
    @Test
    public void testReadValue() {
        System.out.println("readValue");
        File file = null;
        Class<ExampleClass> aClass = null;
        ObjectMapper instance = new ObjectMapper();
        ExampleClass expResult = null;
        ExampleClass result = instance.readValue(file, aClass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
