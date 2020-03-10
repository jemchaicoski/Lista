package lista;

public class ListaMain {

	public static void main(String[] args) {
		Lista lista = new Lista();
	
		lista.preencheLista(10);
		lista.imprime();
		System.out.println("Está vazia: " + lista.vazia());
		
		System.out.println("fim"); 
	}

	
}