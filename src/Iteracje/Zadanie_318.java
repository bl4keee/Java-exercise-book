package Iteracje;
import java.util.*;

public class Zadanie_318 {

	public static void main(String[] args) {
		
		int ilosc_liczb = 5; // tyle liczb mamy wylosowa� spo�r�d liczb ca�kowitych od 0 do 99
		int i = 1;
		double liczba;
		double suma = 0;
		double min;
		double max;
		
		System.out.println("Program losuje " + ilosc_liczb + " liczb ca�kowitych od 0 do 99,");
		System.out.println("a nast�pnie znajduje najmniejsz� i najwi�ksz�\n"
				+ "oraz oblicza �redni� z wszystkich wylosowanych liczb");

		Random r = new Random();
		min = Math.round(100*(r.nextDouble())); // losuje liczb� od 0 do 99
		System.out.println();
		System.out.print("Wylosowano liczby: " + min + ", ");
		max = min;
		suma += max;
		
		while (i <= ilosc_liczb - 1) {
			liczba = Math.round(100*(r.nextDouble()));
			System.out.print(liczba + ", ");
			if (max < liczba) max = liczba;
			if (liczba < min) min = liczba;
			suma += liczba;
			i++;
		}
	
		System.out.println();
		System.out.println("najwi�ksza liczba to " + max + ", ");
		System.out.println("najmniejsza liczba to " + min + ", ");
		System.out.println("�rednia = " + suma / ilosc_liczb + ".");
	}

}

