/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sjdix
 */
public class PackerTest {
    
    public PackerTest() {

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
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        Coordinates testCoordinates2 = new Coordinates(30,40);
        Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates2);
        Customer c = new Customer("stefan", testAddress0);
        Depot d = new Depot("testDepot1", testAddress0);
        Manifest m = new Manifest();
        System.out.println("packProducts");
        List<Box> result = Packer.packProducts(c, d, m);
        List<Box> expected = null;
        assertEquals(expected, result);
    }
    
}
