package Pliki_o_dostêpie_swobodnym;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File1 plik = new File1();
		
		System.out.println("Program wyœwietla co drugi pomiar wpisany wczeœniej w pliku pomiary.dat.");
		
		plik.zapis_do_pliku();
		plik.odczyt_z_pliku();
		

	}

}
