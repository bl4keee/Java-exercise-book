package Klasa_Osoba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadra  extends osoba {

	
	String wyksztalcenie;
	String stanowisko;
	
	public void inicjuj1() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		inicjuj();
		System.out.println("Podaj wykszta³cenie: ");
		wyksztalcenie = br.readLine();
		System.out.println("Podaj stanowisko: ");
		stanowisko = br.readLine();
	}
	
	public void drukuj1() {
		drukuj();
		System.out.println("Wykszta³cenie: " + wyksztalcenie);
		System.out.println("Stanowisko: " + stanowisko);
	}
}
