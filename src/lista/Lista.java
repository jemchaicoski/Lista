package lista;

public class Lista {

    NoLista primeiro;

    public Lista() {
        this.primeiro = null;
    }

    public void insere(int valor) {
        if (this.primeiro == null) {
            
            this.primeiro = new NoLista(valor);
            
        }else{
            NoLista aux = new NoLista(valor);
            aux.prox = primeiro;
            this.primeiro = aux;
        }
    }
    
    public void imprime() {
    	NoLista aux = this.primeiro;
    	while (aux != null) {
        	System.out.println(aux.getInfo());
        	aux = aux.getProx();
		}
    	
    	
    }

    public void preencheLista(int n) {
		
			for (int i = 0; i < n; i++) {
				this.insere(i);
			}
	}

    public boolean vazia() {
    	boolean vazia = false;
    	if (this.primeiro == null) {
			vazia = true;
		}
    	
    	return vazia;
    }
    
    public NoLista busca(int valor) {
    	NoLista aux = this.primeiro;
    	
    	while (aux != null) {
    		if (aux.getInfo() == valor) {
    			return aux;
    		}
        	aux = aux.getProx();
		}
    	
    	return null;
    }
}
