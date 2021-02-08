public class elemento<TIPO> {
	
	private TIPO val;
	private elemento<TIPO> e;
	private elemento<TIPO> d;
	
	public elemento(TIPO NovoVal)	{
		this.val = NovoVal;
		this.e = null;
		this.d = null;
	}

	public TIPO getValor() {
		return val;
	}

	public void setValor(TIPO valor) {
		this.val = valor;
	}

	public elemento<TIPO> getEsquerda() {
		return e;
	}

	public void setEsquerda(elemento<TIPO> esquerda) {
		this.e = esquerda;
	}

	public elemento<TIPO> getDireita() {
		return d;
	}

	public void setDireita(elemento<TIPO> direita) {
		this.d = direita;
	}
}

