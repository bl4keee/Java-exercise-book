package Iteracje;

public class Zadanie_31 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Program oblicza warto�� funkcji y = 3x \ndla X zmieniaj�cego si� od 0 do 10.");
		
		for (x = 0; x <= 10 ; x++) {
			
			y = 3 * x;
			
			System.out.println("x = " + x + '\t' + "y = " + y); // '\t' - przej�cie do nast�pnej pozycji w tabulacji linii
		}

	}

}
