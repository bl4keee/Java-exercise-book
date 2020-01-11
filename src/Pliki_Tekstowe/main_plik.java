package Pliki_Tekstowe;
import java.io.IOException;

public class main_plik {

	public static void main(String[] args)  throws IOException {
		
		plik p1 = new plik();
		
		p1.czytaj_dane();
		p1.zapisz_dane_do_pliku();
		p1.czytaj_dane_z_pliku();

	}

}
