
public class ComplexoTeste {

	public static void main(String[] args) {
		
		Complexo c1 = new Complexo(2, 3);
		Complexo c2 = new Complexo(5, -4);
		Complexo soma = Complexo.somaComplexos(c1, c2);
		Complexo subtracao = Complexo.subtraiComplexos(c1, c2);
		
		
		
		soma.exibeComplexoMetodo();

	}

}
