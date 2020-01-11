package Pliki_Tekstowe;
import java.io.IOException;

public class main_matrix2 {

	public static void main(String[] args) throws IOException {
		
		matrix2 m2 = new matrix2();
		
		m2.czytaj_dane();
		m2.przetworz_dane();
		m2.zapisz_dane_do_pliku();
		m2.czytaj_dane_z_pliku();

	}

}
