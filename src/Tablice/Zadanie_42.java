package Tablice;

public class Zadanie_42 {

	public static void main(String[] args) {
		
		int i;
		int n = 10;
		
		int dane[] = new int[n];

		for (i = 0; i < dane.length; i++) {
			dane[i] = n-1-i;
			System.out.println("dane[" + i + "] = " + dane[i]);
		}
	}

	}

