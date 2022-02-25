package Ficha4;

public abstract class Fruta {
	//atributos
	protected String nome;
	protected double precoBase;
					
	//Construtores (não tem construtor porque é uma classe abstrata)
	
	//métodos (método abstrato pagar: devolverá um double)
	public abstract double pagar();
				
	//operações
	//definir gets
	public String getNome() {
		return nome;
	}
			
	public double getPrecoBase() {
		return precoBase;
	}
			
	//definir sets
	public void setNome(String aNome) {
		nome=aNome;
	}
			
	public void setPrecoBase(double aPrecoBase) {
		precoBase=aPrecoBase;
	}

}
