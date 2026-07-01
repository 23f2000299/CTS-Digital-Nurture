package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AssertionEx {	
	    static Calculator c;
	     @BeforeAll
	     public static void setup()
	     {
	    	 c= new Calculator();
	     }
		 @Test
		 @Order(1)
		 public void grtrthan() {
			 assertFalse(c.val1(3)<c.val1(2));
		 }
		 @Test
		 @Order(2)
		 public void lsrthan() {
			 assertTrue(c.val1(2)<c.val1(3));
		 }
		 @Test
		 @Order(3)
		 public void test() {
			  assertEquals(8,c.add(3,5),"The result should be 8");		 
		 }	 
		 @Test
		 @Order(4)
		 public void nulltest() {
			 String s = null;
			 assertNull(s);
		 } 
		 @Test
		 @Order(5)
		 public void notnulltest() {
			 String s="hema";
			 assertNotNull(s);
		 }
}
