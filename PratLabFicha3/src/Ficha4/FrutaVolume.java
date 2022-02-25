package Ficha4;

public class FrutaVolume extends Fruta implements Descontavel{
	//atributos
	private double volume;
	private double percentagemDesconto; 	//deverá ter um valor entre 0 e 1. ex: 0.5 = 50% desconto

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
				
	//métodos
	//implementação método da casse abstrata Fruta
	public double pagar(){ 
		double precoTotal;
		precoTotal=(precoBase-descontar())*volume;		
		return precoTotal;
	}
	//implementação método da interface Descontável
	public double descontar() {
		return precoBase*percentagemDesconto;
		}
			
	//operações
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
		percentagemDesconto=percentagem;		//deverá ter um valor entre 0 e 1. ex: 0.5 = 50% desconto
		}
		else {
			System.out.println("Erro, a percentagem introduzida deverá ser um valor entre 0(0%) e 1(100%)");
		}
	}
}
