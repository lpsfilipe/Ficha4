package Ficha4;

public class FrutaPeso extends Fruta implements Descontavel{
	//atributos
		private double peso;
		private double percentagemDesconto; 	//dever� ter um valor entre 0 e 1. ex: 0.5 = 50% desconto

	//Construtores
	//Construtor 1: sem definir desconto (fica a zero)
	public FrutaPeso(String aNome,double aPrecoBase, double aPeso) {
		//super();
		nome=aNome;
		precoBase=aPrecoBase;
		peso=aPeso;
		percentagemDesconto=0.0;
	}
	//Construtor 2: permite definir desconto
	public FrutaPeso(String aNome,double aPrecoBase, double aPeso, double aPercentagemDesconto) {
		nome=aNome;
		precoBase=aPrecoBase;
		peso=aPeso;
		percentagemDesconto=aPercentagemDesconto;
	}
					
	//m�todos
	//implementa��o m�todo da casse abstrata Fruta
		public double pagar(){ 
			double precoTotal;
			precoTotal=(precoBase-descontar())*peso;	
			return precoTotal;
		}
	//implementa��o m�todo da interface Descont�vel
		public double descontar() {
		return precoBase*percentagemDesconto;
		}
				
	//opera��es
	//definir gets
		public double getPeso(){
			return peso;
		}
	//definir sets
		public void setPeso(double aPeso){
			peso = aPeso;
		}
		public void setPercentagemDesconto(double percentagem){
			if(percentagem>=0&&percentagem<=1){
			percentagemDesconto=percentagem;		//dever� ter um valor entre 0 e 1. ex: 0.5 = 50% desconto
			}
			else {
				System.out.println("Erro, a percentagem introduzida dever� ser um valor entre 0(0%) e 1(100%)");
			}
		}
}
