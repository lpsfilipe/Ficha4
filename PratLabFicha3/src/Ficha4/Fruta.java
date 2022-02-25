package Ficha4;

public abstract class Fruta {
	//atributos
	protected String nome;
	protected double precoBase;
					
	//Construtores (n�o tem construtor porque � uma classe abstrata)
	
	//m�todos (m�todo abstrato pagar: devolver� um double)
	public abstract double pagar();
				
	//opera��es
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
