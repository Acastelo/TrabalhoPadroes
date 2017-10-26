package adapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorExistenteAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		int resultado = 0;
		for (int index = 0; index < vetor.length; index++) {
			lista.add(vetor[index]);
		}
		resultado = somaLista(lista);
		return resultado;
	}

}
