package Tablice;

public class Zadanie_412_BubbleSort {

	public static void main(String[] args) {
		
		
		// Deklaracje
		int i, j, x;
		int liczby[] = new int[6];
		liczby[0] = 574;
		liczby[1] = 303;
		liczby[2] = 34;
		liczby[3] = 125;
		liczby[4] = 8;
		liczby[5] = 23;
		
		// Pierwszy komunikat i wyœwietlenie liczb, dla których odbêdzie siê sortowanie
		System.out.println("Dla liczb: ");
		for (i = 0; i <= 5; i++) {
			if (i <= 4) {
				System.out.print(liczby[i] + ", ");
			} else {
				System.out.print(liczby[i] + "");
			}
		}
		System.out.println("");
		
		// BubbleSort
		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				if (liczby[j - 1] > liczby[j]) {
					x = liczby[j - 1];
					liczby[j - 1] = liczby[j];
					liczby[j] = x;
				}
			}
		
		// Wyœwietlenie uporz¹dkowanych liczb
		System.out.println("Uporz¹dkowane liczby to: ");
		for (i = 0; i <= 5; i++) {
			if (i <= 4) {
				System.out.print(liczby[i] + ", ");
			} else {
				System.out.print(liczby[i] + ".");
			}
		}
	}

}
}