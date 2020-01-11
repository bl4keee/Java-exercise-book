package Tablice;

public class Zadanie_47 {

	public static void main(String[] args) {
		
		// Zmienne 
		int n = 10;
		int j, i, suma;
		int tablica[][] = new int[n][n];
		
		// Wpisywanie liczb do tablicy 
		for (i = 0; i < tablica.length; i++) {
			for (j = 0; j < tablica.length; j++) {
				if (j == 0) tablica[i][j] = i;
				if (j == 1) tablica[i][j] = i * i;
				if (j > 1) tablica[i][j] = 0;
			}
		}
		
		// Wyœwietlanie tablicy 
		for (i = 0; i < tablica.length; i++) {
			for (j = 0; j < tablica.length; j++) {
				System.out.print(tablica[i][j] + " ");
			}
			System.out.println();
		}
		
		// Obliczanie sumy dla pierwszej kolumny
		suma = 0;
		
		for (i = 0; i < tablica.length; i++) {
			suma += tablica[i][0];
		}
		System.out.println("Suma liczb znajduj¹cych siê w pierwszej kolumnie to: " + suma + ".");
		
		// Obliczanie sumy dla drugiej kolumny
		suma = 0;
		
		for (i = 0; i < tablica.length; i++) {
			suma += tablica[i][1];
		}
		System.out.println("Suma liczb znajduj¹cych siê w drugiej kolumnie to: " + suma + ".");
	}
	}


