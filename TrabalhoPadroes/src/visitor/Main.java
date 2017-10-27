package visitor;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Dados dados = new Dados(9000);

		for (int i = 0; i < dados.getVetor().length; i++) {
			System.out.println(dados.getVetor()[i]);
		}

		int[] vetorAux = Arrays.copyOf(dados.getVetor(), dados.getVetor().length);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dados.aceitarVisitor(new BubbleSortVisitor());

		dados.setVetor(Arrays.copyOf(vetorAux, vetorAux.length));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dados.aceitarVisitor(new QuickSortVisitor());
		
		dados.setVetor(Arrays.copyOf(vetorAux, vetorAux.length));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dados.aceitarVisitor(new MergeSortVisitor());

		/*System.out.println("\n=====================VETOR ORDENADO================================");
		for (int i = 0; i < dados.getVetor().length; i++) {
			System.out.println(dados.getVetor()[i]);
		}*/

	}
}
