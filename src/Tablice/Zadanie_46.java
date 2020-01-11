package Tablice;

public class Zadanie_46 {

	public static void main(String[] args) {
		
		int i, j, suma;
		int n = 10;
		
		int macierz[][] =  new int[n][n];
		
		// Wpisywanie do tablicy 1 w wyznaczonych miejscach, a 0 w pozosta³ych
		for (i=0; i < macierz.length; i++) {
			for (j=0; j < macierz.length; j++) {
				if(n == i + j + 1) {
					macierz[i][j] = i;
				} else {
					macierz[i][j] = 0;
				}
			}
		}

		// wyœwietlanie zawartoœci
				for (i=0; i < macierz.length; i++) {
					for (j=0; j < macierz.length; j++) {
						System.out.print(macierz[i][j] + " ");
					}
					System.out.println();
			}
				// liczenie sumy 
				suma = 0;
				
				for (i=0; i < macierz.length; i++) {
					suma += macierz[i][n-i-1];
				}
				System.out.println("Suma wyró¿nionych elementów w tablicy wynosi " + suma + ".");

		}
		}

	
