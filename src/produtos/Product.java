package produtos;

public class Product {
	private String name;
	private float code;
	private double price;
	private int stock;
	

	public Product(String nome, float codigo, double preco, int estoque) {
		// TODO Auto-generated constructor stub
		this.name = nome;
		this.code = codigo;
		this.price = preco;
		this.stock = estoque;
	}


	public int getStock() {
		return stock;
	}


	public void addStock(int quantidade) {
		this.stock += quantidade;
	}
	
	public boolean removeStock(int quantity) {
        if (this.stock >= quantity) {
            this.stock -= quantity;
            return true;
        }
        return false;
    }


	public String getName() {
		return name;
	}


	public void setName(String nome) {
		this.name = nome;
	}


	public float getCode() {
		return code;
	}


	public void setCode(float codigo) {
		this.code = codigo;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double preco) {
		this.price = preco;
	}

}
