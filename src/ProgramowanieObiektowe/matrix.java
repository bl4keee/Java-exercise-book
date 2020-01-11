package ProgramowanieObiektowe;
import java.util.Random;
//import java.util.*;

public class matrix {

	// Metoda czytaj_dane
	public void czytaj_dane(double [][] macierz, int rozmiar) {
		int i, j;
		Random rand = new Random();
		
		for (i = 0; i < rozmiar; i ++) {
			for (j = 0; j < rozmiar; j ++) {
				if (i == j) {
					macierz[i][j] = Math.round(9*(rand.nextDouble())); // liczby od 0 do 9 na przek¹tnej
				} else { 
					macierz[i][j] = 0; // 0 poza przek¹tn¹
				}
			}
		}
	}
	
	// Metoda przetworz_dane
	public void przetworz_dane(double [][] macierz, int rozmiar) {
		int i;
		double suma = 0;
		
		for (i = 0; i < rozmiar; i ++) {
			suma += macierz[i][i];
			
			System.out.println("Suma elementów na przek¹tnej wynosi = " + (int) suma + "."); // casting do inta
		}
	}
	
	// Metoda wyswietl_wynik
	public void wyswietl_wynik(double [][] macierz, int rozmiar) {
		int i, j;
		
		for (i = 0; i < rozmiar; i ++) {
			for (j = 0; j < rozmiar; j ++) {
				System.out.print((int) macierz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
