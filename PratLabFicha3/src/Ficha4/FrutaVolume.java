package Ficha4;

public class FrutaVolume extends Fruta implements Descontavel{
	//atributos
	private double volume;
	private double percentagemDesconto; 	//dever� ter um valor entre 0 e 1. ex: 0.5 = 50% desconto

	//Construtores
	//Construtor 1: sem definir desconto (fica a zero)
	public FrutaVolume(String aNome,double aPrecoBase, double aVolume) {
		//super();
		nome=aNome;
		precoBase=aPrecoBase;
		volume=aVolume;
	}
	//Construtor 2: permite definir desconto
	public FrutaVolume(String aNome,double aPrecoBase, double aVolume, double aPercentagemDesconto) {
		//super();
		nome=aNome;
		precoBase=aPrecoBase;
		volume=aVolume;
		percentagemDesconto=aPercentagemDesconto;
	}
				
	//m�todos
	//implementa��o m�todo da casse abstrata Fruta
	public double pagar(){ 
		double precoTotal;
		precoTotal=(precoBase-descontar())*volume;		
		return precoTotal;
	}
	//implementa��o m�todo da interface Descont�vel
	public double descontar() {
		return precoBase*percentagemDesconto;
		}
			
	//opera��es
	//definir gets
	public double getVolume(){
		return volume;
	}
	//definir sets
	public void setVolume(double aVolume){
		volume = aVolume;
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
