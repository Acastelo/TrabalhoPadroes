package memento;

public class CalculadoraMemento {
	private Operacao operacao;
	private double valor;
	
	public CalculadoraMemento(Operacao operacao, double valor) {
		this.operacao = operacao;
		this.valor = valor;
	}
	
	public Operacao getOperacao() {
		return operacao;
	}

	public double getValor() {
		return valor;
	}
}