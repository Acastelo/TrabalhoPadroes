package visitor;

import java.util.Random;

public class Dados implements DadosElement {

	private int[] vetor;

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public Dados(int quantidadeVetor) {
		vetor = new int[quantidadeVetor];
		// TODO Auto-generated constructor stub
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = new Random().nextInt(quantidadeVetor);
		}
	}

	@Override
	public void aceitarVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitar(this);

	}

}
