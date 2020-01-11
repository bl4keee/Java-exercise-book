package Iteracje;

public class Zadanie_313 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0;
		
		System.out.println("Program sumuje liczby nieparzyste od 1 do 100.");
		
		for (i = 1; i <= 100; i++) {
			if (!(i % 2 == 0)) suma += i;
		}
		System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + suma + ".");

	}

}
