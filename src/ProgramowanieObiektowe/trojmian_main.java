package ProgramowanieObiektowe;
import java.io.IOException;

public class trojmian_main {

	public static void main(String[] args) throws IOException {
		
		trojmian trojmian1 = new trojmian();
		
		trojmian1.czytaj_dane();
		trojmian1.przetworz_dane();
		trojmian1.wyswietl_wynik();

	}

}
