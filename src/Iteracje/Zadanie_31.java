package Iteracje;

public class Zadanie_31 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Program oblicza wartoœæ funkcji y = 3x \ndla X zmieniaj¹cego siê od 0 do 10.");
		
		for (x = 0; x <= 10 ; x++) {
			
			y = 3 * x;
			
			System.out.println("x = " + x + '\t' + "y = " + y); // '\t' - przejœcie do nastêpnej pozycji w tabulacji linii
		}

	}

}
