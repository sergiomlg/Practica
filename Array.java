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
		String[] claves = {"adios","bbb"};
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
		String[] claves = {"hola","aa"};
		String[] valores = {"adios","bb"};
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
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		a.put("hola","adios");
		assertEquals(new String("adios"),new String(a.get("hola")));
	}
	
	@Test
	public void testInsertaDuplicado() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		a.put("a","adios");
		assertEquals(new String("adios"),new String(a.get("a")));
	}
	@Test
	public void testgetOrElseVacio() {
		ArrayAsociativo a = new ArrayAsociativo();
		assertEquals(new String("hola"),new String(a.getOrElse("hola","hola")));
	}
	
	@Test
	public void testgetOrElseEncontrado() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertEquals(new String("b"),new String(a.getOrElse("a", "ok")));
	}
	
	@Test
	public void testgetOrElseNoEncontrado() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertEquals(new String("ok"),new String(a.getOrElse("b", "ok")));
	}
	
	@Test
	public void containsKeyVacio() {
		ArrayAsociativo a = new ArrayAsociativo();
		assertFalse(a.containsKey("hola"));
	}
	
	@Test
	public void containsKeyFallo() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertFalse(a.containsKey("hola"));
	}
	
	@Test
	public void containsKeyAcierto() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertTrue(a.containsKey("a"));
	}
	@Test
	public void testRemoveVacio() {
		ArrayAsociativo a = new ArrayAsociativo();
		assertFalse(a.remove("a"));
	}
	
	@Test
	public void testRemoveAcierto() {
		String[] claves = {"a"};
		String[] valores = {"b"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertTrue(a.remove("a"));
		assertFalse(a.containsKey("a"));
	}
	
	@Test
	public void testRemoveFallo() {
		String[] claves = {"aaa"};
		String[] valores = {"bbb"};
		ArrayAsociativo a = new ArrayAsociativo(claves,valores);
		assertFalse(a.remove("bbb"));
		assertFalse(a.containsKey("aaa"));
	}
	

}
