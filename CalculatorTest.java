import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal=new Calculator();
	@Test
	void testSum() {
		int res=cal.sum(5,10);
		
		
		assertEquals(15, res);//check for equality 
		
	}

}
