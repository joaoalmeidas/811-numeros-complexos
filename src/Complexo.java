
public class Complexo {
	
	private double parteReal;
	private double parteImaginaria;
	private final static String I = "i";
	
	public Complexo() {
		this(1, 1);
	}
	
	public Complexo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	public String getI() {
		return I;
	}
	
	public static Complexo somaComplexos(Complexo a, Complexo b) {
		
		Complexo c = new Complexo((a.getParteReal() + b.getParteReal()), (a.getParteImaginaria() + b.getParteImaginaria()));
		return c;
		
	}
	
	public static Complexo subtraiComplexos(Complexo a, Complexo b) {
		
		Complexo c = new Complexo((a.getParteReal() - b.getParteReal()), (a.getParteImaginaria() - b.getParteImaginaria()));
		return c;
		
	}
	
	public void exibeComplexoMetodo() {
		
		System.out.println("Complexo(Parte Real, Parte Imaginária)");
		System.out.println("Complexo("+getParteReal()+", "+getParteImaginaria()+")");
		
	}
	
	public String toString() {
		return String.format("Parte Real: %.1f\tParte Imaginária: %.1f", getParteReal(), getParteImaginaria());
	}

}
