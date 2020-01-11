package Pliki_Tekstowe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class plik {

	// Deklaracje
	String imie;
	String nazwisko;
	String dane; // przechowuje info przed zapisaniem do pliku
	String dane1; // przechowuje dane odczytane z pliku
	
	// Metoda czytaj_dane
	public void czytaj_dane() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Proszê podaæ imiê: ");
		imie = br.readLine();
		System.out.println("Proszê podaæ nazwisko: ");
		nazwisko = br.readLine();
		dane = imie + " " + nazwisko;
	}
	
	// Metoda zapisz_dane_do_pliku
	public void zapisz_dane_do_pliku() throws IOException {
		System.out.println("Zaspisujemy dane do pliku...");
		FileWriter fw = new FileWriter("dane.txt");
		fw.write(dane);
		fw.close();
	}
	
	// Metoda czytaj_dane_z_pliku
	public void czytaj_dane_z_pliku() throws IOException {
		System.out.println("Odczytujemy dane z pliku...");
		System.out.println("");
		FileReader fr = new FileReader("dane.txt");
		BufferedReader br = new BufferedReader(fr);
		
		// Pêtla odczytuj¹ca dane z pliku jeœli nie jest pusty
		while ((dane1 = br.readLine()) != null) {
			System.out.println(dane1);
		}
		fr.close();
	}
}
