package junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class CalculatorTest {	
	//Arrange
	static Calculator c;
	@BeforeAll
	static void setupt() {
		c= new Calculator();
	}	
	//Act and Assert	
	@Test
	void TestMethod1()
	{
		assertEquals(8,c.add(2,5),"The result should be 8");
	}
	@Test
	void TestMethod2()
	{
		assertEquals(9,c.add(4, 5),"the result is wrong");
	}
	@Test
	void TestMethod3()
	{
		assertEquals(9,c.add(1, 5),"the result is wrong");
	}
	@AfterAll
	static void cleanup() {
		System.out.println("Testing done");
	}
}