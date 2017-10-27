/*
 * Em um jogo de cartas online, dois participantes possuem, inicialmente, uma coleção de 20 cartas consigo (podem ser repetidas).
 * A cada rodada, os jogadores mostram suas cartas atuais.
 * Quem tiver a carta menor, ganha a carta do seu adversário e a adiciona, juntamente com sua carta, ao final da sua lista de cartas.
 * Caso as cartas sejam iguais, essas cartas vão para o fim da lista de cartas dos seus respectivos jogadores.
 * Ganha o jogo quem finalizar primeiro sua lista.
 * Para jogar este jogo, cada jogador deve implementar um Iterator de cartas, contendo os métodos próximo (pega a primeira da lista),
 * remover (remove a carta em questão), final (coloca uma ou mais cartas no fim da fila), e estaVazia (verifica se a lista está vazia).
 * Os Jogadores A e B se inscreveram no jogo, mas A armazenou suas cartas em um ArrayList, enquanto B as armazenou em uma j.
 * Implemente esse jogo e os jogadores usando o padrão Iterator. 
 */
package iterator;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public static void main(String[] args) {

		Participante jogadorA = new JogadorA();
		Participante jogadorB = new JogadorB();

		IteratorInterface itA = jogadorA.criarIterator();
		IteratorInterface itB = jogadorB.criarIterator();

		boolean fim = true;

		while (fim) {
			if (!itA.estaVazia() && !itB.estaVazia()) {
				int cartaA = itA.proximo();
				int cartaB = itB.proximo();
				List<Integer> lista = new ArrayList<Integer>();
				itA.remover();
				itB.remover();
				if (cartaA > cartaB) {
					lista.add(cartaA);
					lista.add(cartaB);
					itB.Final(lista);
				} else if (cartaA < cartaB) {
					lista.add(cartaA);
					lista.add(cartaB);
					itA.Final(lista);
				} else if (cartaA == cartaB) {
					lista.add(cartaA);
					itA.Final(lista);
					List<Integer> lista2 = new ArrayList<Integer>();
					lista2.add(cartaB);
					itB.Final(lista2);
				}
			} else {
				fim = false;
			}
		}
	}
}
