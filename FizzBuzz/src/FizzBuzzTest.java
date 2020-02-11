import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void generarUno() {
		FizzBuzz fb= new FizzBuzz();
		assertEquals("1", fb.generar(1));
	}
	
	@Test
	public void generarFizz() {
		FizzBuzz fb= new FizzBuzz();
		assertEquals("Fizz", fb.generar(3));
	}
	
	@Test
	public void generarBuzz() {
		FizzBuzz fb= new FizzBuzz();
		assertEquals("Buzz", fb.generar(5));
	}
	

	
}
