package Tablice;

public class Zadanie_410 {

	public static void main(String[] args) {
		
		
		// Deklaracje
		int n = 10;
		int i, j;
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		
		// Wpisywanie liczb do macierzy A
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				a[i][j] = 1;
			}
		}
		
		// Wy�wietlanie macierzy A
		System.out.println("Macierz A prezentuje si� nast�puj�co: ");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
	}
		// Wpisywanie liczb do macierzy B
		for (i = 0; i < b.length; i++) {
			for (j = 0; j < b.length; j++) {
				b[i][j] = 2;
			}
		}
		System.out.println();
		
		// Wy�wietlanie macierzy B
		System.out.println("Macierz B prezentuje si� nast�puj�co: ");
		for (i = 0; i < b.length; i++) {
			for (j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
		}
			System.out.println();
			}
		System.out.println();
		
		// Wpisywanie r�nicy liczb macierzy B i A do macierzy C
		for (i = 0; i < c.length; i++) {
			for (j = 0; j < c.length; j++) {
				c[i][j] = b[i][j] - a[i][j];
			}
	}
		
		// Wy�wietlanie macierzy C
		System.out.println("Macierz C, kt�ra jest r�nic� macierzy B i A prezentuje si� nast�puj�co: ");
		for (i = 0; i < c.length; i++) {
			for (j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
		}
			System.out.println();
			}
}


	}


