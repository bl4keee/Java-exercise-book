package ProgramowanieObiektowe;
import java.io.*;

public class pole_prostokata {

	// Variables
	double a; 
	double b;
	double pole;
	
	// 1st method - czytaj_dane()
	public void czytaj_dane() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Program oblicza pole prostok¹ta.");
		System.out.println("Proszê podaæ d³ugoœæ boku A: ");
		a = Double.parseDouble(br.readLine());
		System.out.println("Proszê podaæ d³ugoœæ boku B: ");
		b = Double.parseDouble(br.readLine());
	}
	
	// 2nd method - przetworz_dane()
	public void przetworz_dane() {
		pole = a * b;
	}
	
	// 3rd method - wyswietl_wynik()
	public void wyswietl_wynik() {
		System.out.print("Dla boku A = ");
		System.out.printf("%2.2f", a);
		System.out.print(" i boku B = ");
		System.out.printf("%2.2f", b);
		System.out.print(" pole prostok¹ta wynosi ");
		System.out.printf("%2.2f.\n", pole);
	}
	}

