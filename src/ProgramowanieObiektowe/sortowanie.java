package ProgramowanieObiektowe;

public class sortowanie {

	// Metoda czytaj_dane
	public void czytaj_dane(int [] liczby, int n) {
		int i;
		
		liczby[0] = 57;
		liczby[1] = 303;
		liczby[2] = 34;
		liczby[3] = 1025;
		liczby[4] = 8;
		liczby[5] = 20;
		
		System.out.println("Liczby nieposortowane to: ");
		
		for (i = 0; i < n; i ++) {
			if (i < n - 1) {
				System.out.print(liczby[i] + ",");
			} else {
				System.out.print(liczby[i] + ".");
			}
		}
		System.out.println();
	}
	
	// Metoda przetworz_dane
	public void przetworz_dane(int [] liczby, int n) {
		int i, j, x;
		
		for (i = 1; i <= n-1; i ++) {
			for (j = n-1; j >=i; --j) {
				if (liczby[j-1] > liczby[j]) {
					x = liczby[j-1];
					liczby[j-1] = liczby[j];
					liczby[j] = x;
				}
			} // j
		} // i
	}
	
	// Metoda wyswietl_wynik
	public void wyswietl_wynik(int [] liczby, int n) {
		int i;
		
		for (i = 0; i < n; i ++) {
			if (i < n-1) {
				System.out.print(liczby[i] + ", ");
			} else {
				System.out.print(liczby[i] + ".");
			}
		}
		System.out.println();
	}
}
