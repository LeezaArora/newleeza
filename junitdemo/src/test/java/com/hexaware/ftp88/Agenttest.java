import org.junit.Test;



 public class Agenttest
{ 
    @Test
    public final void teststudent() {
        Agent obj1 = new Agent (1,"df",34.2,PaymentMode.YEARLY,MaritalStatus.MARRIED,"JF");
        assertEquals(1,obj1.getagentId());
        assertEquals("df",obj1.getagentname());
        assertEquals(34.2,obj1.getpremium(), 0.01);
        assertEquals(PaymentMode.YEARLY,obj1.getPaymentMode());
        assertEquals(maritalStatus.MARRIED,obj1.getmaritalStatus());
        assertEquals("YEARLY",obj1.getPaymentMode().toString());
        assertEquals("MARRIED",obj1.getmaritalStatus().toString());
        assertEquals("rd",obj1.getcity());
    }
}