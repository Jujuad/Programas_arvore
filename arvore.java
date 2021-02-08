public class arvore<TIPO extends Comparable>  {
	
	private elemento<TIPO> raiz;
	
	public arvore()	{
		this.raiz = null;
	}
	
	public void adicionar( TIPO valor )	{
		
		elemento<TIPO> novoElemento = new elemento<TIPO>(valor);
		
		if ( raiz == null )	{
			this.raiz = novoElemento;
		}
		
		else	{
			elemento<TIPO> atual = this.raiz;
			while (true)	{
				if ( novoElemento.getValor().compareTo(atual.getValor()) == -1)	{
					
					if ( atual.getEsquerda() != null )	{
						atual = atual.getEsquerda();
					}
					
					else	{
						atual.setEsquerda(novoElemento);
						break;
					}
				}
				
					else	{
					
					if ( atual.getDireita() != null )	{
						atual = atual.getDireita();
					}
					
					else	{
						atual.setDireita(novoElemento);
						break;
						
		} } } } }
	
	public elemento<TIPO> getRaiz() {
		return raiz;
	}

	public void setRaiz(elemento<TIPO> raiz) {
		this.raiz = raiz;
	}

	public void emOrdem(elemento<TIPO> atual)	{
		
		if ( atual != null)	{
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
	}
	
	public void preOrdem(elemento<TIPO> atual)	{
		
		if ( atual != null)	{
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}
	
	public void posOrdem(elemento<TIPO> atual)	{
	
		if ( atual != null)	{
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
}

