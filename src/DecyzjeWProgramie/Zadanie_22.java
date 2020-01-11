package DecyzjeWProgramie;
import java.io.*;

public class Zadanie_22 {

	public static void main(String[] args) throws IOException {
		
		double a; 
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Program oblicza pierwiastki r�wnania ax^2+bx+c = 0.");
		System.out.println("Prosz� poda� bok A: ");
		a = Double.parseDouble(br.readLine());
		
		if(a == 0) {
			System.out.println("Niedozwolona warto�� wsp�czynnika A.");
		} else {
			System.out.println("Prosz� poda� bok B: ");
			b = Double.parseDouble(br.readLine());
			System.out.println("Prosz� poda� bok C: ");
			c = Double.parseDouble(br.readLine());
			
			delta = b*b-4*a*c;
			
			if(delta < 0) {
				System.out.println("Brak pierwiastk�w rzeczywistych.");
			} else {
				if(delta == 0) {
					x1 = -b/(2*a);
					System.out.printf("Dla a = " + "%4.2f,", a);
					System.out.printf(" b = " + "%4.2f,", b);
					System.out.printf(" c = " + "%4.2f,", c);
					System.out.print("Tr�jmian ma jeden pierwiastek podw�jny x1 = ");
					System.out.printf("%4.2f,", x1);
					System.out.println("");
				} else {
					x1 = (-b-Math.sqrt(delta))/(2*a);
					x2 = (-b+Math.sqrt(delta))/(2*a);
					System.out.printf("Dla a = " + "%4.2f,", a);
					System.out.printf(" b = " + "%4.2f,", b);
					System.out.printf(" c = " + "%4.2f\n", c);
					System.out.print("Tr�jmian ma dwa pierwiastki: ");
					System.out.printf("x1 = ");
					System.out.printf("%4.2f,", x1);
					System.out.printf(" x2 = ");
					System.out.printf("%4.2f.\n", x2);
					System.out.println("");
				}
			}
		}

	}

}
