package Tablice;
import java.io.*;

public class Zadanie_413_TextString {

	public static void main(String[] args) throws IOException {
		
		// Declaration
		String imie, nazwisko;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// User stuff
		System.out.println("Program mierzy d�ugo�� �a�cucha imi� i naziwsko.");
		System.out.println("Prosz� poda� imi�: ");
		imie = br.readLine();
		System.out.println("Prosz� poda� nazwisko: ");
		nazwisko = br.readLine();
		
		// Output
		System.out.println("Imi� " + imie + " zawiera " + imie.length() + " znak�w.");
		System.out.println("Nazwisko " + nazwisko + " zawiera " + nazwisko.length() + " znak�w.");
	}

}
