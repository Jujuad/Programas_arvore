public class arvore_teste {

	public static void main(String[] args) {

		arvore<Integer> arvore = new arvore<Integer>();
		arvore.adicionar(9);
		arvore.adicionar(78);
		arvore.adicionar(5);
		arvore.adicionar(45);
		arvore.adicionar(18);
		arvore.adicionar(20);
		arvore.adicionar(14);
		arvore.adicionar(50);
		System.out.println("Em ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\nPr� Ordem: ");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\nP�s Ordem: ");
		arvore.posOrdem(arvore.getRaiz());
	}
}
