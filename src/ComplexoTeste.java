
public class ComplexoTeste {

	public static void main(String[] args) {
		
		Complexo c1 = new Complexo(2, 3);
		Complexo c2 = new Complexo(5, -4);
		Complexo soma = Complexo.somaComplexos(c1, c2);
		Complexo subtracao = Complexo.subtraiComplexos(c2, c1);
		
		System.out.println("Cálculos números complexos:");
		
		System.out.printf("Soma entre os números:\n%s\n%s\n\n", c1.toString(), c2.toString());
		
		System.out.println("Resultado: ");
		
		soma.exibeComplexoMetodo();
		
		System.out.printf("\nSubtração entre os números:\n%s\n%s\n\n", c1.toString(), c2.toString());
		
		System.out.println("Resultado: ");
		
		subtracao.exibeComplexoMetodo();

	}

}
