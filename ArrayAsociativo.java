import java.util.NoSuchElementException;

public class ArrayAsociativo {
	//Clases internas
	private class Nodo{
		private String clave;
		private String valor;
		private Nodo sig; //siguiente nodo
		
		public Nodo(String c, String v, Nodo s){
			clave = c;
			valor = v;
			sig = s;
		}
	}
	
	//Variables de instancia
	private Nodo primero;
	
	
	//Constructores
	public ArrayAsociativo(){
		primero = null;
	}
	
	public ArrayAsociativo(String[] claves, String[] valores){
		this();
		if (claves.length > 0){
			primero = new Nodo(claves[0], valores[0],null);
			for (int i = 1; i< claves.length; i++){
				Nodo nuevo = new Nodo(claves[i], valores[i],primero);
				primero = nuevo;
			}
		}
	}
	
	//Métodos de instancia
	public  int size(){
		int res=0;
		if(primero == null){
			res=0;
		}else {
			
			while(primero != null){
				res++;
				primero=primero.sig;
			}
		
			
		}
		return res;
	}
public String get(String clave){
		
		boolean encontrado=false;

		while(primero != null && !encontrado){
			if(primero.clave==clave){
				encontrado=true;
			}else{
				primero=primero.sig;
			}
		}
		if(encontrado){//encontrado
			return primero.valor;
		}
		else{
			return null;
		}
	}
public void put(String clave, String valor){
	boolean repe=false;
	
	while(primero!=null && !repe){
		if(primero.clave==clave){
			repe=true;
		}else{
			primero=primero.sig;
		}
	}
	
	if(!repe){				
		Nodo nuevo=new Nodo(clave,valor,null);
		primero=nuevo;
		
	}else{
		primero.valor=valor;	
	}
}
	
	
}
