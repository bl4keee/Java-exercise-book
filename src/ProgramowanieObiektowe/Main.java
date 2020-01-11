package ProgramowanieObiektowe;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		pole_prostokata pole1 = new pole_prostokata();
		
		pole1.czytaj_dane();
		pole1.przetworz_dane();
		pole1.wyswietl_wynik();
	}

}
