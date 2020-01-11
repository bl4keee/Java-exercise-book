package Iteracje;

public class Zadanie_319 {

	public static void main(String[] args) {
		
		int n = 10;
		int wiersze;
		int kolumny;
		
		System.out.println("Program wyœwietla tabliczkê mno¿enia dla liczb od 1 do 100.\n");
		
		for (wiersze = 1; wiersze <= n; wiersze ++) {
			for (kolumny = 1; kolumny <= n; kolumny ++) {
				System.out.print(wiersze * kolumny + "\t");
			}
			System.out.println();
		}

	}

}
