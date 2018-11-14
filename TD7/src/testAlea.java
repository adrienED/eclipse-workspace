import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAlea {

	@Test
	void testAlea() {
		
		int n = QUestion_1.alea();
		assertTrue(n>-21 && n<=50);
	}

}
