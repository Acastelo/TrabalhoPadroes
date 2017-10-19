package builder;

public class ItemProduct {
	double preco;
	String nome;
	int quantidade;
	Tipo tipo;
	enum Tipo {
		SANDUICHE, BATATA, REFRIGERANTE, BRINQUEDO
	};

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ItemProduct copy() {
		ItemProduct item = new ItemProduct();
		item.preco = this.preco;
		item.nome = this.nome;
		item.tipo = this.tipo;
		item.quantidade = this.quantidade;
		return item;
	}
}
