package lista;

public class NoLista {
    int info;
    NoLista prox;
    
    public NoLista(int info){
        this.info = info;
    }

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public NoLista getProx() {
		return prox;
	}

	public void setProx(NoLista prox) {
		this.prox = prox;
	}
}
