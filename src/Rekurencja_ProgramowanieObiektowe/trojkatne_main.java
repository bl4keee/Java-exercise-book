package Rekurencja_ProgramowanieObiektowe;

public class trojkatne_main {

	public static void main(String[] args) {
		
		
		int i; 
		int n = 10;
		trojkatne t = new trojkatne();
		
		System.out.println("Program znajduje 10 pierwszych liczb trójk¹tnych.\n");
		
		for (i = 1; i <= n; i ++) {
			System.out.println(i + "# = " + t.triangle(i));
		}
	}

}
