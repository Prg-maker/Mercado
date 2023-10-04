package modelo;



public class Produto {
	private static int count =1;
	private int id;
	private String nome;
	private Double preco;
	
	public Produto( String nome, Double preco) {
		
		this.id = Produto.count;
		this.nome = nome;
		this.preco = preco;
		Produto.count++;
		   
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Id: " + this.getId() + 
				"\n Nome: "  + this.getNome() + 
				"\n Preço " + utils.Utils.doubleToString(this.getPreco());
	}
	
	
	
	
}
