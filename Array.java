import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class Array {
	
	@Test
	public void ArraysizeEs0() {
		assertEquals(new Integer(0), new Integer((new ArrayAsociativo()).size()));
	}
	@Test
	public void testSizenovacio() {
		String[] claves = {"hola","aaa"};
		String[] valores = {"adios","bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertNotEquals(new Integer(0), new Integer (a.size()));
	}
	@Test
	public void GetArrayVacio(){
		assertEquals(null,new ArrayAsociativo().get("Hola"));
	}
	@Test
	public void testBuscarExiste() {
		String[] claves = {"hola","aaa"};
		String[] valores = {"adios","bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertTrue("Iguales", new String("adios").equals(a.get("hola")));
	}
	@Test
	public void testInsertaVacio() {
		String[] claves = {};
		String[] valores = {};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		a.put("hola","adios");
		assertEquals(new String("adios"),new String(a.get("hola")));
	}
	

}
