package Iteracje;

public class Zadanie_33 {

	public static void main(String[] args) {
		
		int x = 0, y = 0; // przy 'while' trzeba ustali� pocz�tkowe warto�ci
		
		System.out.println("Program oblicza warto�� funkcji y = 3x \ndla X zmieniaj�cego si� od 0 do 10.");
		
		while (x <= 10) {
			y = 3 * x;
			System.out.println("x = " + x + '\t' + "y = " + y);
			x++;
		} 


	}

}




