package Iteracje;

public class Zadanie_321 {

	public static void main(String[] args) {
		
		int n = 10;
		int wiersze;
		int kolumny;
		
		System.out.println("Program wyœwietla tabliczkê mno¿enia dla liczb od 1 do 100.\n");
		
		wiersze = 1;
		
		while (wiersze <= n) {
			kolumny = 1;
			while (kolumny <= n) {
				System.out.print(wiersze * kolumny + "\t");
				kolumny++;
			}
			wiersze++;
			System.out.println();
		}
		
	}


	}


