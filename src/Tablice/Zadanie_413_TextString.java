package Tablice;
import java.io.*;

public class Zadanie_413_TextString {

	public static void main(String[] args) throws IOException {
		
		// Declaration
		String imie, nazwisko;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// User stuff
		System.out.println("Program mierzy d³ugoœæ ³añcucha imiê i naziwsko.");
		System.out.println("Proszê podaæ imiê: ");
		imie = br.readLine();
		System.out.println("Proszê podaæ nazwisko: ");
		nazwisko = br.readLine();
		
		// Output
		System.out.println("Imiê " + imie + " zawiera " + imie.length() + " znaków.");
		System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " znaków.");
	}

}
