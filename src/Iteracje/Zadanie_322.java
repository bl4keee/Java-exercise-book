package Iteracje;

public class Zadanie_322 {

	public static void main(String[] args) {
		
		char znak;
		
		System.out.println("Program wyœwietla du¿e litery alfabetu od A do Z i od Z do A.\n");
		
		for (znak = 'A'; znak <= 'Z'; znak++) {
			if (znak < 'Z') {
				System.out.print(znak + ", ");
			} else {
				System.out.println(znak + ".");
			}
		}
			for (znak = 'Z'; znak >= 'A'; znak--) {
				if (znak > 'A') {
					System.out.print(znak + ", ");
				} else {
					System.out.println(znak + ".");
				}
			}
		}

	}

