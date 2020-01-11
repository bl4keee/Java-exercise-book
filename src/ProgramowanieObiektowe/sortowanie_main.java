package ProgramowanieObiektowe;

public class sortowanie_main {

	public static void main(String[] args) {
	
		int n = 6;
		int [] liczby = new int [n];
		
		sortowanie babelki = new sortowanie();
		
		babelki.czytaj_dane(liczby, n);
		babelki.przetworz_dane(liczby, n);
		babelki.wyswietl_wynik(liczby, n);

	}

}
