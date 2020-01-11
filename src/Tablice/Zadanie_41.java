package Tablice;

public class Zadanie_41 {

	public static void main(String[] args) {
		
		int i;
		int n = 10;
		
		int dane[] = new int[n];

		for (i = 0; i < dane.length; i++) {
			dane[i] = i;
			System.out.println("dane[" + i + "] = " + dane[i]);
		}
	}

}
