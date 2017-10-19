package builder;

public abstract class ItemBuilder {

	protected ItemProduct item;

	public ItemBuilder() {
		item = new ItemProduct();
	}

	public abstract void buildPreco();

	public abstract void buildNome();

	public abstract void buildTipo();

	public void buildQuantidade(int quantidade) {
		item.quantidade = quantidade;
	}
	

	public ItemProduct getItem() {
		return item;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemBuilder other = (ItemBuilder) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		return true;
	}
}
