package Iteracje;
import java.util.*;

public class Zdanie_316 {

	public static void main(String[] args) {
		
		int ilosc_liczb = 5; // tyle liczb mamy wylosowaæ spoœród liczb ca³kowitych od 0 do 99
		int i;
		double liczba;
		double suma = 0;
		double min;
		double max;
		
		System.out.println("Program losuje " + ilosc_liczb + " liczb ca³kowitych od 0 do 99,");
		System.out.println("a nastêpnie znajduje najmniejsz¹ i najwiêksz¹\n"
				+ "oraz oblicza œredni¹ z wszystkich wylosowanych liczb");

		Random r = new Random();
		min = Math.round(100*(r.nextDouble())); // losuje liczbê od 0 do 99
		System.out.println();
		System.out.print("Wylosowano liczby: " + min + ", ");
		max = min;
		suma += max;
		
		for (i = 1; i <= ilosc_liczb - 1; i++) { // w pêtli for sprawdzam czy nastêpna wylosowana liczba jest wiêksza lub mniejsza od poprzedniej
			liczba = Math.round(100*(r.nextDouble()));
			System.out.print(liczba + ", ");
			if (max < liczba) max = liczba;
			if (liczba < min) min = liczba;
			
			suma += liczba;
		}
		System.out.println();
		System.out.println("najwiêksza liczba to " + max + ", ");
		System.out.println("najmniejsza liczba to " + min + ", ");
		System.out.println("œrednia = " + suma / ilosc_liczb + ".");
	}

}
