package Iteracje;

public class Zadanie_324 {

	public static void main(String[] args) {
		
		char znak; 
		
		System.out.println("Program wyœwietla litery alfabetu od A do Z i od Z do A.\n");
		
		// Pierwsza pêtla while - od A do Z 
		znak = 'A';
		while (znak <= 'Z') {
			if (znak < 'Z') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
			znak++;
		}
		
		// Druga pêtla while - od Z do A
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
