/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

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
public class BoxTest {
    
    public BoxTest() {
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
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product p = new Product("Nails", 3, false, true);
        Coordinates testCoordinates1 = new Coordinates(0,0);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer c = new Customer("stefan", testAddress1);
        Depot testDepot1 = new Depot("City Depot", testAddress1);
        Box b = new Box(c, testDepot1);
        b.addProduct(p, 1);
    }

    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalWeight method, of class Box.
     */
    @Test
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getTotalWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = null;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
        Product p = new Product("Nails", 3, true, true);
        Coordinates testCoordinates1 = new Coordinates(0,0);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer c = new Customer("stefan", testAddress1);
        Depot testDepot1 = new Depot("City Depot", testAddress1);
        Box b = new Box(c, testDepot1);
        boolean expResult = true;
        boolean result = b.isFragile();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of isHazardous method, of class Box.
//     */
//    @Test
//    public void testIsHazardous() {
//        System.out.println("isHazardous");
//        Box instance = null;
//        boolean expResult = false;
//        boolean result = instance.isHaz;
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
