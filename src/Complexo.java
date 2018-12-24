
public class Complexo {
	
	private double parteReal;
	private double parteImaginaria;
	private final static String i = "i";
	
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
		return i;
	}

}
