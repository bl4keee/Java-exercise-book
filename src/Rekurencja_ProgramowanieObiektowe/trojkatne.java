package Rekurencja_ProgramowanieObiektowe;

public class trojkatne {

	public static int triangle(int n) {
		
		if (n == 1) {
			return n;
		} else { 
			return (n + triangle(n - 1));
		}
	}
}
