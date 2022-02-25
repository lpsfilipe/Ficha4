package Ficha4;

public class FrutaUnidade extends Fruta{
	//atributos
		private int unidades;

	//Construtores
		public FrutaUnidade(String aNome,double aPrecoBase, int aUnidades) {
			//super();
			nome=aNome;
			precoBase=aPrecoBase;
			unidades=aUnidades;
		}
				
	//métodos
		public double pagar(){ 
			double precoTotal;
			precoTotal=precoBase*unidades;	
			return precoTotal;
		}
			
	//operações
	//definir gets
		public int getUnidades(){
			return unidades;
		}
	//definir sets
		public void setUnidades(int aUnidades){
			unidades = aUnidades;
		}
}