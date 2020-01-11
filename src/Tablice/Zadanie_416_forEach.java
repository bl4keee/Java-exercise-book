package Tablice;

public class Zadanie_416_forEach {

	public static void main(String[] args) {
		
		// Declarations
		int i;
		int n = 100;
		int dane[] = new int [n];
		int suma_p = 0; // suma liczb parzystych
		int suma_np = 0; // suma liczb nieparzystych
		
		// User interaction
		System.out.println("Program sumuje liczby parzyste i nieparzyste znajduj¹ce siê\n"
				+ "w przedziale od 1 do 100 i znajduj¹ce siê w tablicy.");
		
		// Entering numbers from 1 to 100 into array 'dane'
		for (i = 1; i <= dane.length; i++) {
			dane[i - 1] = i;
		}
		
		// For-each loop
		for (int x : dane) {
			if ((x % 2) == 0) {
				suma_p += x; // addition of even numbers from array
			} else {
				suma_np += x; // addition of odd numbers from array
			}
		}
		
		// Output
		System.out.println("Suma liczb parzystych od 1 do 100 wynosi " + suma_p + ".");
		System.out.println("Suma liczb nieparzystych od 1 do 100 wynosi " + suma_np + ".");
	}

}
