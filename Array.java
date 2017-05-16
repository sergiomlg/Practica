import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class Array {
	@Parameter
	private String[] claves={"hola"};
	private String[] valores={"hola"};
	@Test
	public void ArraysizeEs0() {
		assertEquals(new Integer(0), new Integer((new ArrayAsociativo()).size()));
	}
	@Test
	public void ArraySizeNoes0(){
		assertEquals(new Integer(1), new Integer((new ArrayAsociativo(claves,valores)).size()));
	}
	

}
