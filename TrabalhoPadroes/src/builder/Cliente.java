/*
 * Na cadeia de restaurantes   h� um padr�o para montagem de lanches de crian�as.
 * O sandu�che (hamb�rguer ou cheeseburger), a batata (pequena, m�dia ou grande) e o brinquedo (carrinho ou bonequinha)
 * s�o colocados dentro de uma caixa e o refrigerante (coca ou guaran�) � entregue fora da caixa.
 * A classe abaixo � dada para representar o pedido de um consumidor.
 * Neste caso, o padr�o Builder pode ser usado para separar as tarefas do atendente e do funcion�rio que monta o pedido.
 * Somente este �ltimo sabe como montar os pedidos segundo os padr�es da empresa, mas � o atendente quem lhe informa quais itens o consumidor pediu.
 * Implemente a simula��o do restaurante fast-food descrita acima utilizando o padr�o Builder e escreva uma classe cliente que pede um lanche ao atendente,
 * recebe-o do outro funcion�rio e imprime o pedido.
 */
package builder;

import static builder.Atendente.getInstancia;

public class Cliente {
	
	public static void main(String[] args) {

		Atendente atendente = getInstancia();
		atendente.adicionarProduto(new Hamburguer());
		atendente.montarItem(2);
		
		atendente.adicionarProduto(new Cheesburguer());
		atendente.montarItem(1);
		
		atendente.adicionarProduto(new BatataPequena());
		atendente.montarItem(3);
		
		atendente.adicionarProduto(new RefrigeranteCoca());
		atendente.montarItem(1);
		
		atendente.adicionarProduto(new BrinquedoCarrinho());
		atendente.montarItem(2);
		
		atendente.fecharPedido();
	}
}
