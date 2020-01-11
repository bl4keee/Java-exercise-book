package Tablice;

public class Zadanie_43 {

	public static void main(String[] args) {
		
		int n = 10;
		int i;
		int j;
		int suma;
		
		int macierz[][] = new int[n][n];

		// 1 po przekątnej, 0 w pozostałych miejscach
		for (i=0; i < macierz.length; i++) {
			for (j=0; j < macierz.length; j++) {
				if (i == j) {
					macierz[i][j] = 1;
				} else {
					macierz[i][j] = 0;
				}
			}
		}
		
		// wyświetlanie zawartości
		for (i=0; i < macierz.length; i++) {
			for (j=0; j < macierz.length; j++) {
				System.out.print(macierz[i][j] + " ");
			}
			System.out.println();
	}
		// liczenie sumy 
		suma = 0;
		
		for (i=0; i < macierz.length; i++) {
			suma += macierz[i][i]; // suma = suma + macierz[i][i]
		}
		System.out.println("Suma wyróżnionych elementów w tablicy wynosi " + suma + ".");

}
}
