package Iteracje;

public class Zadanie_39 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;

		System.out.println("Program sumuje liczby ca³kowite od 1 do 100.");
		
		while (i <= 100) {
			suma += i;
			i++;
		}
		System.out.println("Suma liczb ca³kowitych od 1 do 100 wynosi " + suma + ".");

	}

}
