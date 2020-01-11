package DecyzjeWProgramie;
import java.io.*;
import java.util.*;

public class Zadanie_25 {

	public static void main(String[] args) throws IOException {
		
		double losuj_liczbe;
		double zgadnij_liczbe;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program losuje liczbê z przedzia³u od 0 do 9. Zgadnij tê liczbê.");
		
		Random r = new Random();
		losuj_liczbe = Math.round(10*(r.nextDouble())); // zaokr¹glenie liczby zmiennoprzecinkowej do liczby ca³kowitej
		zgadnij_liczbe = Double.parseDouble(br.readLine());
		
		if (zgadnij_liczbe == losuj_liczbe) {
			System.out.println("Gratulacje. Odgad³eœ liczbê!");
		} else { 
			System.out.print("Przykro mi, wylosowana liczba to ");
			System.out.println((int) losuj_liczbe + "."); // casting - losuj_liczbe jest double, zmieniam na int
		}

	}

}
