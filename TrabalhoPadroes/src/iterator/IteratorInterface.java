package iterator;

import java.util.List;

public interface IteratorInterface {
	
	/*
	 * Pega a primeira da lista
	 */
	int proximo();

	/* 
	 * Remove a carta em questão
	 */
	void remover();
	
	/* 
	 * Coloca uma ou mais cartas no fim da fila
	 */
	void Final(List<Integer> lista);
	
	/*
	 * Verifica se a lista está vazia
	 */
	boolean estaVazia();

	boolean temProximo();
}