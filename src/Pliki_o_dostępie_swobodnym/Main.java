package Pliki_o_dost�pie_swobodnym;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File1 plik = new File1();
		
		System.out.println("Program wy�wietla co drugi pomiar wpisany wcze�niej w pliku pomiary.dat.");
		
		plik.zapis_do_pliku();
		plik.odczyt_z_pliku();
		

	}

}
