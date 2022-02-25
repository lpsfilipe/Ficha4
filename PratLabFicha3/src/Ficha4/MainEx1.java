package Ficha4;

//import java.math.BigDecimal;		//usar BigDecimal.valueof(double) -> nao funciona

public class MainEx1 {
	public static void main(String[] args) {
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exerc�cio 1 - Classes FrutaUnidade, FrutaPeso e FrutaVolume
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Teste Exerc�cio 1:");
		//cria��o de duas inst�ncias de cada tipo (bananas e morangos)
		//instanciar bananas
		FrutaUnidade fruta1 = new FrutaUnidade("Banana",5.0,3);
		FrutaPeso fruta2 = new FrutaPeso("Banana",5.0,0.5);
		FrutaVolume fruta3 = new FrutaVolume("Banana",5.0,8);
		//instanciar morangos
		FrutaUnidade fruta4 = new FrutaUnidade("Morango",3.0,10);
		FrutaPeso fruta5 = new FrutaPeso("Morango",3.0,0.15);
		FrutaVolume fruta6 = new FrutaVolume("Morango",3.0,0.1);
		//Ajudar a perceber resultados:
		System.out.println("O pre�o base de " + fruta1.getNome() + " �: " + fruta1.getPrecoBase());
		System.out.println("O pre�o base de " + fruta4.getNome() + " �: " + fruta4.getPrecoBase());
		System.out.println(" ");
		//testar instancias de todos os tipos de uma fruta (bananas)
		System.out.println("1. O pre�o de " + fruta1.getUnidades() + " unidades de " + fruta1.nome + " �: " + fruta1.pagar() + " �");
		System.out.println("2. O pre�o de " + fruta2.getPeso() + " kgs de " + fruta2.nome + " �: " + fruta2.pagar() + " �");
		System.out.println("3. O pre�o de " + fruta3.getVolume() + " m3 de " + fruta3.nome + " �: " + fruta3.pagar() + " �");
		
		//testar instancias de todos os tipos de outra fruta (morangos)
		System.out.println("4. O pre�o de " + fruta4.getUnidades() + " unidades de " + fruta4.nome + " �: " + fruta4.pagar() + " �");
		System.out.println("5. O pre�o de " + fruta5.getPeso() + " kgs de " + fruta5.nome + " �: " + fruta5.pagar() + " �");
		System.out.println("6. O pre�o de " + fruta6.getVolume() + " m3 de " + fruta6.nome + " �: " + fruta6.pagar() + " �");
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exerc�cio 2 - Intrdu��o da classe Cesto (conjunto de objetos da classe Fruta)
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println(" ");		//introduzir linha em branco na consola para facilitar leitura
		System.out.println("Teste Exerc�cio 2:");
		//Instanciar 3 cestos para teste: bananas, morangos, todos
		//Cesto1: todas as bananas
		Cesto cesto1 = new Cesto();		//instanciar Cesto vazio
		cesto1.insereFruta(fruta1);		//ao inserir frutas no cesto, testo o m�todo insereFruta(Fruta)
		cesto1.insereFruta(fruta2);
		cesto1.insereFruta(fruta3);
		System.out.println("A soma dos pre�os de todos os objetos do tipo banana(1,2 e 3) �: " + cesto1.calculaValorTotal());		//testar m�todo calculaValorTotal()
		//Cesto2: todos os morangos
		Cesto cesto2 = new Cesto();
		cesto2.insereFruta(fruta4);
		cesto2.insereFruta(fruta5);
		cesto2.insereFruta(fruta6);
		System.out.println("A soma dos pre�os de todos os objetos do tipo morango(4,5 e 6) �: " + cesto2.calculaValorTotal());		//testar m�todo calculaValorTotal() com outro cesto
		//Testar fun��o .getClass()... para obter String com o nome da classe (parte dos m�todos a testar a seguir)
		String className = cesto1.getClass().getSimpleName();
		System.out.println("Este objeto � do tipo: " + className);
		
		//Cesto3: todas as frutas
		Cesto cesto3 = new Cesto();
		cesto3.insereFruta(fruta1);
		cesto3.insereFruta(fruta2);
		cesto3.insereFruta(fruta3);
		cesto3.insereFruta(fruta4);
		cesto3.insereFruta(fruta5);
		cesto3.insereFruta(fruta6);
		//Teste fun��o getNumFrutasByTipo(String): Cestos 1 e 2 t�m um tipo de cada, 3 tem 2 de cada
		System.out.println("O Cesto1 t�m " + cesto1.getNumFrutasByTipo("FrutaUnidade") + " objetos do tipo FrutaUnidade");
		System.out.println("O Cesto2 t�m " + cesto2.getNumFrutasByTipo("FrutaUnidade") + " objetos do tipo FrutaUnidade");
		System.out.println("O Cesto2 t�m " + cesto2.getNumFrutasByTipo("FrutaVolume") + " objetos do tipo FrutaVolume");
		System.out.println("O Cesto3 t�m " + cesto3.getNumFrutasByTipo("FrutaVolume") + " objetos do tipo FrutaVolume");
		//Teste fun��o calculaValorTipo(String)
		System.out.println("A soma dos pre�os de todos os objetos FrutaUnidade (1 e 4) no Cesto3 �: " + cesto3.calculaValorTipo("FrutaUnidade") + "�");
		System.out.println("A soma dos pre�os de todos os objetos FrutaPeso (2 e 5) no Cesto3 �: " + cesto3.calculaValorTipo("FrutaPeso") + "�");
		System.out.println("A soma dos pre�os de todos os objetos FrutaVolume (3 e 6) no Cesto3 �: " + cesto3.calculaValorTipo("FrutaVolume") + "�");
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exerc�cio 3 - Intrdu��o da interface Descontavel (FrutaPeso e FrutaVolume)
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Mostrar valor das frutas 2,3 e 5 (2.FrutaPeso, 3.FrutaVolume e 5.FrutaPeso) sem desconto
		System.out.println(" ");		//introduzir linha em branco na consola para facilitar leitura
		System.out.println("Teste Exerc�cio 3:");
		System.out.println("O valor sem desconto da fruta2 �: " + fruta2.pagar());
		System.out.println("O valor sem desconto da fruta3 �: " + fruta3.pagar());
		System.out.println("O valor sem desconto da fruta5 �: " + fruta5.pagar());
		//fazer descontos
		fruta2.setPercentagemDesconto(0.5);
		fruta3.setPercentagemDesconto(0.25);
		fruta5.setPercentagemDesconto(0.1);
		//Mostrar valor das frutas 2 e 3 (2.FrutaPeso e 3.FrutaVolume) com o desconto (testar interface)
		System.out.println("O valor com desconto de 50% da fruta2 �: " + fruta2.pagar());
		System.out.println("O valor com desconto de 25% da fruta3 �: " + fruta3.pagar());
		System.out.println("O valor com desconto de 10% da fruta5 �: " + fruta5.pagar());
		
	}
}
