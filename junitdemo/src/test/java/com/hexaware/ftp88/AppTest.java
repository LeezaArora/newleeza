package com.hexaware.ftp88;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{   @Test
    public void testApp() {
        App obj1 = null;
        assertNull(obj1);
        App obj2 = new App();
        assertNotNull(obj2);

    }
    @Test
    public void testeven() {
        assertTrue(App.even(6));
        assertFalse(App.even(5));
    }
    @Test
    public void testmax() {
        assertEquals(13,App.max(7,5,13));
    }
    @Test
    public void testsum() {
        assertEquals(4,App.sum(2,2));
       // assertEquals(5,App.sum(2,3));
    }
    @Test
    public void testSayHello() {
        assertEquals("welcome",App.sayHello());
    }
    @Test
    public final void testEquals() {
        Employ e1 = new Employ(12,"VAIBHAV","JAVA","PROGRAMMER",42234);
        Employ e2 = new Employ(12,"VAIBHAV","JAVA","PROGRAMMER",42234);
        Employ e3 = new Employ(12,"VAIBHAV","ANGULAR","PROGRAMMER",42234);
        
        assertEquals(e1,e2);
        assertNotEquals(e1,e3);
        assertNotEquals(e3,e2);
    }
}
