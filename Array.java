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
	@Test
	public void testInsertaConElem() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		a.put("hola","adios");
		assertEquals(new String("adios"),new String(a.get("hola")));
	}
	
	@Test
	public void testInsertaDuplicado() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		a.put("aaa","adios");
		assertEquals(new String("adios"),new String(a.get("aaa")));
	}
	@Test
	public void testgetOrElseVacio() {
		ArrayAsociativo a = new ArrayAsociativo();
		assertEquals(new String("defecto"),new String(a.getOrElse("hola","defecto")));
	}
	
	@Test
	public void testgetOrElseEncontrado() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertEquals(new String("bbb"),new String(a.getOrElse("aaa", "defecto")));
	}
	
	@Test
	public void testgetOrElseNoEncontrado() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertEquals(new String("defecto"),new String(a.getOrElse("bbb", "defecto")));
	}
	
	@Test
	public void containsKeyVacio() {
		ArrayAsociativo a = new ArrayAsociativo();
		assertFalse(a.containsKey("hola"));
	}
	
	@Test
	public void containsKeyFallo() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertFalse(a.containsKey("hola"));
	}
	
	@Test
	public void containsKeyAcierto() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertTrue(a.containsKey("aaa"));
	}
	

}
