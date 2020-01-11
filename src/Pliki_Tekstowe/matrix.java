package Pliki_Tekstowe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class matrix {

	// Deklaracje
	int rozmiar = 10; // macierz 10x10
	
	// Metoda czytaj_dane
	public void czytaj_dane(int tablica[][], int rozmiar) {
		int i; 
		int j;
		
		System.out.println("Tworzymy tablicê 10x10...");
		System.out.println();
		
		for (i = 0; i < rozmiar; i++) {
			for (j = 0; j < rozmiar; j++) {
				if (i == j) 
					tablica[i][j] = 1;
				 else 
					tablica[i][j] = 0;
					System.out.print(tablica[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// Metoda zapisz_dane_do_pliku
	public void zapisz_dane_do_pliku(int tablica[][], int rozmiar) throws IOException {
		int i;
		int j;
		
		System.out.println();
		System.out.println("Zapisujemy tablicê 10x10 do pliku...");
		System.out.println();
		FileWriter fw = new FileWriter("dane.txt");
		
		for (i = 0; i < rozmiar; i++) {
			for (j = 0; j < rozmiar; j++) {
				fw.write((char) (tablica[i][j])); // casting do char
				System.out.print(tablica[i][j] + " ");
			}
			System.out.println();
		}
		fw.close();
	}
	
	// Metoda czytaj_dane_z_pliku
	public void czytaj_dane_z_pliku(int tablica1[][], int rozmiar) throws IOException {
		int i;
		int j;
		
		System.out.println();
		System.out.println("Odczytujemy tablicê 10x10 z pliku...");
		System.out.println();
		FileReader fr = new FileReader("dane.txt");
		BufferedReader br = new BufferedReader(fr);
		
		for (i = 0; i < rozmiar; i++) {
			for (j = 0; j < rozmiar; j++) {
				tablica1[i][j] = (int) br.read(); // casting do int przy odczytaniu
				System.out.print(tablica1[i][j] + " ");
			}
			System.out.println();
		}
		fr.close();
	}
}
