package Iteracje;

public class Zadanie_314 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;
		
		System.out.println("Program sumuje liczby nieparzyste od 1 do 100. ");
		
		do {
			if (!(i % 2 == 0)) suma += i;
			i++;
		} while (i <= 100);
		System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + suma + ".");
	}

}
