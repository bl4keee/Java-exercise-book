package Tablice;
import java.io.*;

public class Zadanie_414_Concatenation {

	public static void main(String[] args) throws IOException {
		
		// Declarations
		String lancuch_1, lancuch_2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Asking user
		System.out.println("Program sk�ada dwa �a�cuchy.");
		System.out.println("Podaj pierwszy �a�cuch: ");
		lancuch_1 = br.readLine();
		System.out.println("Podaj drugi �a�cuch: ");
		lancuch_2 = br.readLine();

		
		// Concatenation and outprint
		System.out.println(lancuch_1 + " + " + lancuch_2 + " = " + lancuch_1.concat(lancuch_2));
		System.out.println(lancuch_2 + " + " + lancuch_1 + " = " + lancuch_2.concat(lancuch_1));
		
		if (lancuch_1.equals(lancuch_2)) {
			System.out.println("Sk�adanie dw�ch r�wnych �a�cuch�w jest przemienne.");
		} else {
			System.out.println("Sk�adanie dw�ch r�nych �a�cuch�w nie jest przemienne.");
		}
	}

}
