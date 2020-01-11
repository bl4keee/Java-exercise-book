package Klasa_Osoba;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class osoba {

	String nazwisko;
	String imie;
	String ulica;
	String kod;
	String miasto;
	
	// Metoda inicjuj
	public void inicjuj() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wprowadzamy dane.");
		System.out.println("Podaj nazwisko: ");
		nazwisko = br.readLine();
		System.out.println("Podaj imiê: ");
		imie = br.readLine();
		System.out.println("Podaj ulicê: ");
		ulica = br.readLine();
		System.out.println("Podaj kod pocztowy: ");
		kod = br.readLine();
		System.out.println("Podaj miasto: ");
		miasto = br.readLine();
	}
	
	// Metoda drukuj
	public void drukuj() {
		System.out.println("Wyœwietlenie danych.");
		System.out.println("=======================");
		System.out.println("Nazwisko: " + nazwisko);
		System.out.println("Imiê: " + imie);
		System.out.println("Ulica: " + ulica);
		System.out.println("Kod pocztowy: " + kod);
		System.out.println("Miasto: " + miasto);
	}
}
