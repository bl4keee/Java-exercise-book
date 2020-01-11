package Iteracje;

public class Zadanie_310 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0;

		System.out.println("Program sumuje liczby parzyste od 1 do 100.");

		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) suma += i; // modulo - je¿eli reszta z dzielenia przez 2 wynosi 0 to jest to liczba parzysta
		}
		System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + suma + ".");
	}

}
