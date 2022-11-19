/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.seq;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pawelp
 */
public class SeqTypeTest {

    public SeqTypeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of values method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult
                = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of fromString method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testFromStringFib() {
        System.out.println("fromStringFib");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of fromString method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testFromStringTri() {
        System.out.println("fromStringTri");
        String type = "triibonaci";
        SeqType expResult = SeqType.TRI;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of fromString method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testFromStringLuc() {
        System.out.println("fromStringLuc");
        String type = "lucas";
        SeqType expResult = SeqType.LUC;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenerator method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testGetGeneratorFib() {
        System.out.println("getGeneratorFib");
        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());
    }
    
    /**
     * Test of getGenerator method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testGetGeneratorTri() {
        System.out.println("getGeneratorTri");
        SeqType instance = SeqType.TRI;
        Generator result = instance.getGenerator();
        assertEquals(TribonacciGenerator.class, result.getClass());
    }
    
    /**
     * Test of getGenerator method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testGetGeneratorLuc() {
        System.out.println("getGeneratorLuc");
        SeqType instance = SeqType.LUC;
        Generator result = instance.getGenerator();
        assertEquals(LucasGenerator.class, result.getClass());
    }

}
