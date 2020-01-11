package Iteracje;

public class Zadanie_32 {

	public static void main(String[] args) {
		
		int x = 0, y = 0; // przy 'do... while' trzeba ustaliæ pocz¹tkowe wartoœci
		
		System.out.println("Program oblicza wartoœæ funkcji y = 3x \ndla X zmieniaj¹cego siê od 0 do 10.");
		
		do {
			y = 3 * x;
			System.out.println("x = " + x + '\t' + "y = " + y);
			x++;
		} 
		while (x <= 10);

	}

}
