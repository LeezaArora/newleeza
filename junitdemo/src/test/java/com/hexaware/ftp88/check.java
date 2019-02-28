package com.hexaware.ftp88;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;



class studenttest1
{ 
    @Test
    public final void teststudent() throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d1 = df.parse("12-10-2011");
        Student obj1 = new Student(1,"df","f",d1,"rd",34.2);
        assertEquals(1,obj1.getsno());
        assertEquals("df",obj1.getfirstname());
        assertEquals("f",obj1.getlastname());
        assertEquals(df.parse("12-10-2011"),obj1.getdateofbirth());
        assertEquals("rd",obj1.getcity());
        assertEquals(34.2,obj1.getcgp(), 0.01);
    }
}