package visitor;

public class QuickSortVisitor implements Visitor {

	@Override
	public void visitar(Dados dados) {
		// TODO Auto-generated method stub
		System.out.println("====================================Iniciando ordenação Quick Sort================================");
		long inicio = System.currentTimeMillis();
		quickSort(dados.getVetor(), 0, dados.getVetor().length - 1);
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("O tempo de processamento do Quick Sort foi de "+ tempo +" segundos");

	}

	private void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

}
