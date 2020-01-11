package Pliki_Tekstowe;
import java.io.IOException;

public class main_matrix {

	public static void main(String[] args) throws IOException {
		
		int rozmiar = 10;
		int tab[][] = new int[rozmiar][rozmiar];
		int tab1[][] = new int[rozmiar][rozmiar];
		
		matrix matrix1 = new matrix();
		matrix1.czytaj_dane(tab, rozmiar);
		matrix1.zapisz_dane_do_pliku(tab, rozmiar);
		matrix1.czytaj_dane_z_pliku(tab1, rozmiar);


	}

}
