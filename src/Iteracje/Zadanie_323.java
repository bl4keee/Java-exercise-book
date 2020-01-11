package Iteracje;

public class Zadanie_323 {

	public static void main(String[] args) {
		
		char znak;
		
		System.out.println("Program wyœwietla litery alfatbetu od A do Z i od Z do A.\n");
		
		
		// Pierwsza pêtla do... while = od A do Z
		znak = 'A';
		do {
			if (znak < 'Z') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
			znak++;
		} while (znak <= 'Z');
		
	
		
		// Druga pêtla do... while = od Z do A
		znak = 'Z';
		do {
			if (znak > 'A') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
			znak--;
		} while (znak >= 'A');

	}

}
