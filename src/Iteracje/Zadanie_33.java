package Iteracje;

public class Zadanie_33 {

	public static void main(String[] args) {
		
		int x = 0, y = 0; // przy 'while' trzeba ustaliæ pocz¹tkowe wartoœci
		
		System.out.println("Program oblicza wartoœæ funkcji y = 3x \ndla X zmieniaj¹cego siê od 0 do 10.");
		
		while (x <= 10) {
			y = 3 * x;
			System.out.println("x = " + x + '\t' + "y = " + y);
			x++;
		} 


	}

}




