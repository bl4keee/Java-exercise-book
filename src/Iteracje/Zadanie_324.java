package Iteracje;

public class Zadanie_324 {

	public static void main(String[] args) {
		
		char znak; 
		
		System.out.println("Program wy�wietla litery alfabetu od A do Z i od Z do A.\n");
		
		// Pierwsza p�tla while - od A do Z 
		znak = 'A';
		while (znak <= 'Z') {
			if (znak < 'Z') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
			znak++;
		}
		
		// Druga p�tla while - od Z do A
		znak = 'Z';
		while (znak >= 'A') {
			if (znak > 'A') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
			znak--;
		}

	}

}
