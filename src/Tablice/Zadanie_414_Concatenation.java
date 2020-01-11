package Tablice;
import java.io.*;

public class Zadanie_414_Concatenation {

	public static void main(String[] args) throws IOException {
		
		// Declarations
		String lancuch_1, lancuch_2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Asking user
		System.out.println("Program sk³ada dwa ³añcuchy.");
		System.out.println("Podaj pierwszy ³añcuch: ");
		lancuch_1 = br.readLine();
		System.out.println("Podaj drugi ³añcuch: ");
		lancuch_2 = br.readLine();

		
		// Concatenation and outprint
		System.out.println(lancuch_1 + " + " + lancuch_2 + " = " + lancuch_1.concat(lancuch_2));
		System.out.println(lancuch_2 + " + " + lancuch_1 + " = " + lancuch_2.concat(lancuch_1));
		
		if (lancuch_1.equals(lancuch_2)) {
			System.out.println("Sk³adanie dwóch równych ³añcuchów jest przemienne.");
		} else {
			System.out.println("Sk³adanie dwóch ró¿nych ³añcuchów nie jest przemienne.");
		}
	}

}
