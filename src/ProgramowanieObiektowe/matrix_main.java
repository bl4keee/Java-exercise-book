package ProgramowanieObiektowe;

public class matrix_main {

	public static void main(String[] args) {
		
		int rozmiar = 10;
		double [][] tablica = new double [rozmiar][rozmiar];
		
		matrix matrix1 = new matrix();
		
		matrix1.czytaj_dane(tablica, rozmiar);
		matrix1.przetworz_dane(tablica, rozmiar);
		matrix1.wyswietl_wynik(tablica, rozmiar);

	}

}
