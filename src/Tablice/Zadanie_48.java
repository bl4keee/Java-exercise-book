package Tablice;

public class Zadanie_48 {

	public static void main(String[] args) {
		
		int n = 10;
		int i, j;
		int tablicaA[][] = new int[n][n];
		int tablicaB[][] = new int[n][n];

		
		// Wpisywanie wartości do tablicy A
		for (i = 0; i < tablicaA.length; i++) {
			for (j = 0; j < tablicaA.length; j++) {
				tablicaA[i][j] = j;
			}
		}
		
		// Przepisywanie liczb z tablicy A do tablicy B
		for (i = 0; i < tablicaA.length; i++) {
			for (j = 0; j < tablicaA.length; j++) {
				tablicaB[i][j] = tablicaA[j][i]; // Kolumny na wiersze
			}
	}
		
		// Wyświetlanie tablicy A
		System.out.println("Wyświetlam zawartość tablicy A: ");
		for (i = 0; i < tablicaA.length; i++) {
			for (j = 0; j < tablicaA.length; j++) {
				System.out.print(tablicaA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Wyświetlanie tablicy B
		System.out.println("Wyświetlam zawartość tablicy B: ");
		for (i = 0; i < tablicaA.length; i++) {
			for (j = 0; j < tablicaA.length; j++) {
				System.out.print(tablicaB[i][j] + " ");
			}
			System.out.println();
		}
		
}
}