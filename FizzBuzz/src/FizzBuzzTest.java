import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		FizzBuzz fb= new FizzBuzz();
		assertEquals("1", fb.generar(1));
	}
}
