package Iteracje;

public class Zadanie_37 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0;

		System.out.println("Program sumuje liczby całkowite od 1 do 100.");
		
		for (i = 1; i <= 100; i++) {
			suma += i; // suma = suma + i
		}
		System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + suma + ".");
	}

}
