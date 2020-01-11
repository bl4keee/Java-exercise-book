package Pliki_Tekstowe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class matrix2 {
	
	// Deklaracje
	int n = 10;
	int a[][] = new int[n][n];
	int b[][] = new int[n][n];
	int c[][] = new int[n][n];
	
	
	// Metoda czytaj_dane
	public void czytaj_dane() {
		int i, j;
		System.out.println("Tworzymy tablicê A.");
		
		for (i = 0; i < n; i ++) {
			for (j = 0; j < n; j ++) {
				if (i == 1)
					a[i][j] = 1;
				else 
					a[i][j] = 0;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// Metoda przetworz_dane
	public void przetworz_dane() {
		int i, j;
		System.out.println();
		System.out.println("Przepisujemy zawartoœæ tablicy A do tablicy B.");
		
		for (i = 0; i < n; i ++) {
			for (j = 0; j < n; j ++) {
					b[i][j] = a[j][i];
	}
	}
	}
	
	// Metoda zapisz_dane_do_pliku
	public void zapisz_dane_do_pliku() throws IOException {
		int i, j;
		System.out.println();
		System.out.println("Zapisujemy tablicê B do pliku.");
		FileWriter fw = new FileWriter("dane.txt");
		
		for (i = 0; i < n; i ++) {
			for (j = 0; j < n; j ++) {
				fw.write((char) (b[i][j]));
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		fw.close();
	}
	
	// Metoda czytaj_dane_z_pliku
	public void czytaj_dane_z_pliku() throws IOException { 
		int i, j;
		System.out.println();
		System.out.println("Odczytujemy dane z pliku i umieszczamy w tablicy C.");
		FileReader fr = new FileReader("dane.txt");
		BufferedReader br = new BufferedReader(fr);
		
		for (i = 0; i < n; i ++) {
			for (j = 0; j < n; j ++) {
				c[i][j] = (int) br.read(); // casting + odczytywanie z pliku
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		fr.close();
	}
}
