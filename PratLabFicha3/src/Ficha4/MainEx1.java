package Ficha4;

//import java.math.BigDecimal;		//usar BigDecimal.valueof(double) -> nao funciona

public class MainEx1 {
	public static void main(String[] args) {
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exercício 1 - Classes FrutaUnidade, FrutaPeso e FrutaVolume
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Teste Exercício 1:");
		//criação de duas instâncias de cada tipo (bananas e morangos)
		//instanciar bananas
		FrutaUnidade fruta1 = new FrutaUnidade("Banana",5.0,3);
		FrutaPeso fruta2 = new FrutaPeso("Banana",5.0,0.5);
		FrutaVolume fruta3 = new FrutaVolume("Banana",5.0,8);
		//instanciar morangos
		FrutaUnidade fruta4 = new FrutaUnidade("Morango",3.0,10);
		FrutaPeso fruta5 = new FrutaPeso("Morango",3.0,0.15);
		FrutaVolume fruta6 = new FrutaVolume("Morango",3.0,0.1);
		//Ajudar a perceber resultados:
		System.out.println("O preço base de " + fruta1.getNome() + " é: " + fruta1.getPrecoBase());
		System.out.println("O preço base de " + fruta4.getNome() + " é: " + fruta4.getPrecoBase());
		System.out.println(" ");
		//testar instancias de todos os tipos de uma fruta (bananas)
		System.out.println("1. O preço de " + fruta1.getUnidades() + " unidades de " + fruta1.nome + " é: " + fruta1.pagar() + " €");
		System.out.println("2. O preço de " + fruta2.getPeso() + " kgs de " + fruta2.nome + " é: " + fruta2.pagar() + " €");
		System.out.println("3. O preço de " + fruta3.getVolume() + " m3 de " + fruta3.nome + " é: " + fruta3.pagar() + " €");
		
		//testar instancias de todos os tipos de outra fruta (morangos)
		System.out.println("4. O preço de " + fruta4.getUnidades() + " unidades de " + fruta4.nome + " é: " + fruta4.pagar() + " €");
		System.out.println("5. O preço de " + fruta5.getPeso() + " kgs de " + fruta5.nome + " é: " + fruta5.pagar() + " €");
		System.out.println("6. O preço de " + fruta6.getVolume() + " m3 de " + fruta6.nome + " é: " + fruta6.pagar() + " €");
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exercício 2 - Intrdução da classe Cesto (conjunto de objetos da classe Fruta)
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println(" ");		//introduzir linha em branco na consola para facilitar leitura
		System.out.println("Teste Exercício 2:");
		//Instanciar 3 cestos para teste: bananas, morangos, todos
		//Cesto1: todas as bananas
		Cesto cesto1 = new Cesto();		//instanciar Cesto vazio
		cesto1.insereFruta(fruta1);		//ao inserir frutas no cesto, testo o método insereFruta(Fruta)
		cesto1.insereFruta(fruta2);
		cesto1.insereFruta(fruta3);
		System.out.println("A soma dos preços de todos os objetos do tipo banana(1,2 e 3) é: " + cesto1.calculaValorTotal());		//testar método calculaValorTotal()
		//Cesto2: todos os morangos
		Cesto cesto2 = new Cesto();
		cesto2.insereFruta(fruta4);
		cesto2.insereFruta(fruta5);
		cesto2.insereFruta(fruta6);
		System.out.println("A soma dos preços de todos os objetos do tipo morango(4,5 e 6) é: " + cesto2.calculaValorTotal());		//testar método calculaValorTotal() com outro cesto
		//Testar função .getClass()... para obter String com o nome da classe (parte dos métodos a testar a seguir)
		String className = cesto1.getClass().getSimpleName();
		System.out.println("Este objeto é do tipo: " + className);
		
		//Cesto3: todas as frutas
		Cesto cesto3 = new Cesto();
		cesto3.insereFruta(fruta1);
		cesto3.insereFruta(fruta2);
		cesto3.insereFruta(fruta3);
		cesto3.insereFruta(fruta4);
		cesto3.insereFruta(fruta5);
		cesto3.insereFruta(fruta6);
		//Teste função getNumFrutasByTipo(String): Cestos 1 e 2 têm um tipo de cada, 3 tem 2 de cada
		System.out.println("O Cesto1 têm " + cesto1.getNumFrutasByTipo("FrutaUnidade") + " objetos do tipo FrutaUnidade");
		System.out.println("O Cesto2 têm " + cesto2.getNumFrutasByTipo("FrutaUnidade") + " objetos do tipo FrutaUnidade");
		System.out.println("O Cesto2 têm " + cesto2.getNumFrutasByTipo("FrutaVolume") + " objetos do tipo FrutaVolume");
		System.out.println("O Cesto3 têm " + cesto3.getNumFrutasByTipo("FrutaVolume") + " objetos do tipo FrutaVolume");
		//Teste função calculaValorTipo(String)
		System.out.println("A soma dos preços de todos os objetos FrutaUnidade (1 e 4) no Cesto3 é: " + cesto3.calculaValorTipo("FrutaUnidade") + "€");
		System.out.println("A soma dos preços de todos os objetos FrutaPeso (2 e 5) no Cesto3 é: " + cesto3.calculaValorTipo("FrutaPeso") + "€");
		System.out.println("A soma dos preços de todos os objetos FrutaVolume (3 e 6) no Cesto3 é: " + cesto3.calculaValorTipo("FrutaVolume") + "€");
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Teste relativo ao Exercício 3 - Intrdução da interface Descontavel (FrutaPeso e FrutaVolume)
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Mostrar valor das frutas 2,3 e 5 (2.FrutaPeso, 3.FrutaVolume e 5.FrutaPeso) sem desconto
		System.out.println(" ");		//introduzir linha em branco na consola para facilitar leitura
		System.out.println("Teste Exercício 3:");
		System.out.println("O valor sem desconto da fruta2 é: " + fruta2.pagar());
		System.out.println("O valor sem desconto da fruta3 é: " + fruta3.pagar());
		System.out.println("O valor sem desconto da fruta5 é: " + fruta5.pagar());
		//fazer descontos
		fruta2.setPercentagemDesconto(0.5);
		fruta3.setPercentagemDesconto(0.25);
		fruta5.setPercentagemDesconto(0.1);
		//Mostrar valor das frutas 2 e 3 (2.FrutaPeso e 3.FrutaVolume) com o desconto (testar interface)
		System.out.println("O valor com desconto de 50% da fruta2 é: " + fruta2.pagar());
		System.out.println("O valor com desconto de 25% da fruta3 é: " + fruta3.pagar());
		System.out.println("O valor com desconto de 10% da fruta5 é: " + fruta5.pagar());
		
	}
}
