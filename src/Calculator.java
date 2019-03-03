
public class Calculator {
	private double a;
	private double b;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void suma() {
		double sum = a + b;
		System.out.println("Rezultatul adunarii este: " + sum);

	}

	public void scadere() {
		double scad = a - b;
		System.out.println("Rezultatul scaderii este: " + scad);
	}

	public void inmultire() {
		double inm = a * b;
		System.out.println("Rezultatul inmultirii este: " + inm);

	}

	public void impartire() {
		double imp = a / b;
		System.out.println("Rezultatul impartirii este: " + imp);

	}

}
