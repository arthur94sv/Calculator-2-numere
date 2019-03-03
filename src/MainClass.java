import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double val1, val2;
		int varianta;
		System.out.print("Introduceti primul numar = ");
		val1 = input.nextDouble();

		System.out.print("Introduceti al doilea numar = ");
		val2 = input.nextDouble();

		Calculator calc1 = new Calculator();
		calc1.setA(val1);
		calc1.setB(val2);

		System.out.print("Ce doriti sa calculati (1 - adunare; 2 - scadere; 3 - inmultire; 4 - impartire) = ");
		Scanner input2 = new Scanner(System.in);
		varianta = input2.nextInt();

		switch (varianta) {
		case 1:
			calc1.suma();
			break;
		case 2:
			calc1.scadere();
			break;
		case 3:
			calc1.inmultire();
			break;
		case 4:
			calc1.impartire();
			break;

		}
		input.close();
		input2.close();

	}

}
