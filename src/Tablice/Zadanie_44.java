package Tablice;

public class Zadanie_44 {

	public static void main(String[] args) {
		
		int i, j, suma;
		int n = 10;
		
		int macierz[][] =  new int[n][n];
		
		// Wpisywanie do tablicy liczb od 0 do 9 na przekątnej, a 0 w pozostałych
		for (i=0; i < macierz.length; i++) {
			for (j=0; j < macierz.length; j++) {
				if(i == j) {
					macierz[i][j] = i;
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