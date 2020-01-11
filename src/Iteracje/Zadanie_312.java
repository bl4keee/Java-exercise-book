package Iteracje;

public class Zadanie_312 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;

		System.out.println("Program sumuje liczby parzyste od 1 do 100.");
		
		while (i <= 100) {
			if (i % 2 == 0) suma += i;
			i++;
		}
		System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + suma + ".");

	}

}
