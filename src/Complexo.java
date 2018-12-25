
public class Complexo {
	
	private double parteReal;
	private double parteImaginaria;
	private final static double I = Math.sqrt(-1);
	
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

	public double getI() {
		return I;
	}
	
	public static double somaComplexos(Complexo a, Complexo b) {
		return (a.getParteReal() + b.getParteReal()) + (a.getParteImaginaria() + b.getParteImaginaria()) * Complexo.I;
	}
	
	public static double subtraiComplexos(Complexo a, Complexo b) {
		return (a.getParteReal() - b.getParteReal()) + (a.getParteImaginaria() - b.getParteImaginaria()) * Complexo.I;
	}
	
	

}
