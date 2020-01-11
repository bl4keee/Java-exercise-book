package DecyzjeWProgramie;
import java.io.*;

public class Zadanie_23 {

	public static void main(String[] args) throws IOException {
		

		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		char liczba_pierwiastkow = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program oblicza pierwiastki r�wnania kwadratowego ax^2 + bx + c = 0");
		System.out.println("Prosz� poda� A: ");
		a = Double.parseDouble(br.readLine());
		
		if (a == 0) {
			System.out.println("Nieprawid�owa warto�� wsp�czynnika A.");
		} else {
			System.out.println("Prosz� poda� B: ");
			b = Double.parseDouble(br.readLine());
			System.out.println("Prosz� poda� C: ");
			c = Double.parseDouble(br.readLine());
			
			delta = b * b - 4 * a * c;
			
			if (delta == 0) liczba_pierwiastkow = 1;
			if (delta > 0) liczba_pierwiastkow = 2;
			if (delta < 0) liczba_pierwiastkow = 0;
			
			switch (liczba_pierwiastkow) {
			case 0: 
				System.out.println("Brak pierwiastk�w rzeczywistych.");
				break;
			case 1: 
			{
				x1 = - b / (2 * a);
				System.out.printf("Dla A = " + "%4.2f,", a);
				System.out.printf(" B = " + "%4.2f,", b );
				System.out.printf(" C = " + "%4.2f\n", c);
				System.out.print("Tr�jmian ma jeden pierwiastek podw�jny x1 = ");
				System.out.printf("%4.2f.\n", x1);
			}
			break;
			case 2: 
			{
				x1 = (- b - Math.sqrt(delta)) / (2 * a);
				x2 = (- b + Math.sqrt(delta)) / (2 * a);
				System.out.printf("Dla A = " + "%4.2f,", a);
				System.out.printf(" B = " + "%4.2f,", b );
				System.out.printf(" C = " + "%4.2f\n", c);
				System.out.println("Tr�jmian ma dwa pierwiastki x1 = ");
				System.out.printf("%4.2f,", x1);
				System.out.printf("%4.2f.\n", x2);
			}
			break;
		}
	}

}
}