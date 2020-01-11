package Rekurencja_ProgramowanieObiektowe;

public class fib1 {

	public int fib (int n) {
		
		switch (n) {
		case 0: return 0;
		case 1: return 1;
		default: return fib(n-1) + fib(n-2);
		}
	}
}
