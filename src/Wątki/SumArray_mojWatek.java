package W¹tki;

public class SumArray_mojWatek implements Runnable {

	Thread wtk;
	static SumArray sa = new SumArray();
	int a[];
	int odp;
	
	// Tworzenie nowego w¹tku
	SumArray_mojWatek(String nazwa, int liczby[]) {
		wtk = new Thread(this, nazwa);
		wtk.start();
		a = liczby;
	}
	
	// Pocz¹tek wykonywania nowego w¹tku
	public void run() {
		System.out.println(wtk.getName() + " startuje.");
		odp = sa.sumArray(a);
		
		System.out.println("Suma koñcowa dla " + wtk.getName() + " wynosi " + odp + ".");
		System.out.println(wtk.getName() + " zosta³ zakoñczony.");
	}
}
