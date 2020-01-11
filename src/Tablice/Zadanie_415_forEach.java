package Tablice;

public class Zadanie_415_forEach {

	public static void main(String[] args) {
		
		// Declarations
		int i; 
		int suma = 0;
		int n = 100;
		int dane[] = new int[n];
		
		// User interaction and array operations
		System.out.println("Program sumuje liczby od 1 do 100 znajduj¹ce sie w tablicy.");
		System.out.println();
		
		for (i = 1; i <= dane.length; i++) {
			dane[i - 1] = i; // wpisuje do tablicy liczby od 1 do 100
		}
		
		// for-each loop
		for (int x : dane) {
			suma += x; // sumuje liczby od 1 do 100 znajduj¹ce siê w tablicy
		}
		
		// Output
		System.out.println("Suma liczb od 1 do 100 wynosi " + suma + ".");

	}

}
