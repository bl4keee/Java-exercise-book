package Iteracje;

public class Zadanie_38 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;

		System.out.println("Program sumuje liczby ca³kowite od 1 do 100.");
		
		do {
			suma += i;
			i++;
		} while (i <= 100);
		System.out.println("Suma liczb ca³kowitych od 1 do 100 wynosi " + suma + ".");
	}

}
