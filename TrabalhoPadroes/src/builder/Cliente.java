/*
 * Na cadeia de restaurantes   há um padrão para montagem de lanches de crianças.
 * O sanduíche (hambúrguer ou cheeseburger), a batata (pequena, média ou grande) e o brinquedo (carrinho ou bonequinha)
 * são colocados dentro de uma caixa e o refrigerante (coca ou guaraná) é entregue fora da caixa.
 * A classe abaixo é dada para representar o pedido de um consumidor.
 * Neste caso, o padrão Builder pode ser usado para separar as tarefas do atendente e do funcionário que monta o pedido.
 * Somente este último sabe como montar os pedidos segundo os padrões da empresa, mas é o atendente quem lhe informa quais itens o consumidor pediu.
 * Implemente a simulação do restaurante fast-food descrita acima utilizando o padrão Builder e escreva uma classe cliente que pede um lanche ao atendente,
 * recebe-o do outro funcionário e imprime o pedido.
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
