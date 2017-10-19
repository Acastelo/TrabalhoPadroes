package bridge;

public class Main {
	public static void main(String[] args) {

		System.out.println("========================LISTAS ORDENADAS=======================");
		ListaAbstrata listaOrdenada = new ListaOrdenada(new ImprimirNumero());
		listaOrdenada.adicionar("One");
		listaOrdenada.adicionar("Two");
		listaOrdenada.adicionar("Three");
		listaOrdenada.imprimir();
		
		System.out.println("================================================================");
		
		listaOrdenada = new ListaOrdenada(new ImprimirMarcador('*'));
		listaOrdenada.adicionar("java");
		listaOrdenada.adicionar("android");
		listaOrdenada.adicionar("ios");
		listaOrdenada.imprimir();
		
		System.out.println("================================================================");
		
		listaOrdenada = new ListaOrdenada(new ImprimirLetra());
		listaOrdenada.adicionar("Estrutura de Dados");
		listaOrdenada.adicionar("POO");
		listaOrdenada.adicionar("Padrões de Projeto");
		listaOrdenada.imprimir();
		
		System.out.println("========================LISTAS NÂO ORDENADAS======================");
		
		ListaAbstrata listaNaoOrdenada = new ListaNaoOrdenada(new ImprimirNumero());
		listaNaoOrdenada.adicionar("one");
		listaNaoOrdenada.adicionar("two");
		listaNaoOrdenada.adicionar("Three");
		listaNaoOrdenada.imprimir();
		
		System.out.println("================================================================");
		
		listaNaoOrdenada = new ListaNaoOrdenada(new ImprimirMarcador('#'));
		listaNaoOrdenada.adicionar("iOS");
		listaNaoOrdenada.adicionar("Android");
		listaNaoOrdenada.adicionar("Java");
		listaNaoOrdenada.imprimir();
		
		System.out.println("================================================================");
		

		listaNaoOrdenada = new ListaNaoOrdenada(new ImprimirLetra());
		listaNaoOrdenada.adicionar("Estrutura de Dados");
		listaNaoOrdenada.adicionar("POO");
		listaNaoOrdenada.adicionar("Padrões de Projeto");
		listaNaoOrdenada.imprimir();
	}

}
