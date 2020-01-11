package Iteracje;

public class Zadanie_320 {

	public static void main(String[] args) {
		
		int n = 10;
		int wiersze;
		int kolumny;
		
		System.out.println("Program wyœwietla tabliczkê mno¿enia dla liczb od 1 do 100.\n");
		
		wiersze = 1;
		
		do {
			kolumny = 1;
			do {
				System.out.print(wiersze * kolumny + "\t");
				kolumny++;
			} while (kolumny <= n);
			wiersze++;
			System.out.println();
		} while (wiersze <= n);
		
		
	}
}

