package visitor;

public class BubbleSortVisitor implements Visitor {

	@Override
	public void visitar(Dados dados) {
		System.out.println("====================================Iniciando ordenação Bubble Sort================================");
		long inicio = System.currentTimeMillis();
		bubbleSort(dados.getVetor());
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("O tempo de processamento do Bubble Sort foi de "+ tempo +" segundos");

	}

	private void bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}
}