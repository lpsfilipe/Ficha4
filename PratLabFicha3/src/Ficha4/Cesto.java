package Ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
	//atributos
	private int numFrutas;
	private int numMaxFrutas;
	private List<Fruta> frutas;
						
	//Construtores 
	public Cesto() {
		numFrutas=0;
		numMaxFrutas=100;
		frutas = new ArrayList<Fruta>();
	}
	
	//métodos
	//inserir uma fruta no cesto
	public void insereFruta(Fruta aFruta){
		if(frutas.size()<=numMaxFrutas){		//verificar se o cesto já está cheio
			frutas.add(aFruta);
		}
		else{
			System.out.println("Erro: tentou inserir uma fruta num cesto cheio!");
		}
	}
	
	//calcula a soma dos valores de todas as frutas no cesto
	public double calculaValorTotal(){
		double Aux=0.0;
		
		for(Fruta fru: frutas){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			Aux+=fru.pagar();		//funciona para todos os tipos de fruta pq tem o mesmo nome em todas as subclasses
			}
		
		return Aux;
	}
	
	//recebe uma string com o nome do tipo(subclasse) de fruta, e devolve o numero de frutas(objectos) dentro (da lista) do cesto desse tipo
	public int getNumFrutasByTipo(String aTipo){
		int count=0;
		
		for(Fruta fru: frutas){
			if(aTipo.equals(fru.getClass().getSimpleName())){		//verifica se a String do argumento é igual (usando equals) ao nome da classe do objeto analisado (fruta)
				count++;
			}
		}
		
		return count;
	}
	
	//recebe uma string com o nome do tipo(subclasse) de fruta, e calcula a soma dos valores de todas as frutas(objectos) dentro (da lista) do cesto desse tipo
	public double calculaValorTipo(String aTipo){
		double Aux=0.0;
	
		for(Fruta fru: frutas){
			if(aTipo.equals(fru.getClass().getSimpleName())){		//verifica se a String do argumento é igual (usando equals) ao nome da classe do objeto analisado (fruta)
				Aux+=fru.pagar();
			}
		}
		
		return Aux;
	}
	
	//operações
	//definir gets
	public int getNumFrutas() {
			return numFrutas;
	}
				
	public int getNumMaxFrutas() {
		return numMaxFrutas;
	}
	
	public List<Fruta> getFrutas() {
		return frutas;
	}
	
	//definir sets
	public void setNumFrutas(int aNumFrutas) {
		numFrutas=aNumFrutas;
	}
	
	public void setNumMaxFrutas(int aNumMaxFrutas) {
		numMaxFrutas=aNumMaxFrutas;
	}

	public void setFrutas(List<Fruta> aFrutas) {
		frutas=aFrutas;
	}
}
