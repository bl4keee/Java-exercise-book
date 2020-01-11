package ProgramowanieObiektowe;
import java.io.*;

public class trojmian {

	double a, b, c, delta, x1, x2;
	char liczba_pierwiastkow;
	
	// Metoda czytaj_dane
	public void czytaj_dane() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program oblicza pierwiastki r�wnania kwadratowego\n"
				+ "dla dowolnych warto�ci a, b oraz c.");
		System.out.println("Prosz� poda� A: ");
		a = Double.parseDouble(br.readLine());
		
		if (a == 0) {
			System.out.println("Niedozwolona warto�� wsp�czynnika A.");
			System.exit(1);
		} else {
			System.out.println("Prosz� poda� B: ");
			b = Double.parseDouble(br.readLine());
			System.out.println("Prosz� poda� C: ");
			c = Double.parseDouble(br.readLine());
		}
	}
	
	// Metoda przetw�rz_dane
	public void przetworz_dane() {
		delta = b * b - 4 * a * c;
		
		if (delta < 0) liczba_pierwiastkow = 0;
		if (delta == 0) liczba_pierwiastkow = 1;
		if (delta > 0) liczba_pierwiastkow = 2;
		
		switch (liczba_pierwiastkow) {
		case 1: 
			x1 = -b / (2*a);
		break;
		case 2:
		{
			x1 = (-b-Math.sqrt(delta)) / (2 * a);
			x2 = (-b-Math.sqrt(delta)) / (2 * a);
		}
		break;
		}
	}
	
	// Metoda wy�wietl_wynik
	public void wyswietl_wynik() {
		System.out.println("Dla liczb ");
		System.out.printf("A = " + "%2.2f,", a);
		System.out.printf(" B = " + "%2.2f,", b);
		System.out.printf(" C = " + "%2.2f", c);
		
		switch (liczba_pierwiastkow) {
		case 0: 
			System.out.print(" brak pierwiastk�w rzeczywistych.\n");
			break;
		case 1: 
			System.out.printf(" tr�jmian ma jeden pierwiastek: " + "x1 = " + "%2.2f.\n", x1);
			break;
		case 2: 
		{
			System.out.print(" tr�jmian ma dwa pierwiastki: ");
			System.out.printf("x1 = " + "%2.2f", x1);
			System.out.printf(", x2 = " + "%2.2f.\n", x2);
		}
		break;
		}
	}
	
}
