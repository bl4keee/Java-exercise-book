package W�tki;

public class SumArray_mojWatek2 implements Runnable {

	Thread wtk;
	static SumArray sa = new SumArray();
	int a[];
	int odp;
	
	// Tworzenie nowego w�tku
	SumArray_mojWatek2(String nazwa, int liczby[]) {
		wtk = new Thread(this, nazwa);
		wtk.start();
		a = liczby;
	}
	
	// Pocz�tek wykonywania nowego w�tku
	public void run() {
		System.out.println(wtk.getName() + " startuje.");
		synchronized(sa) {
			odp = sa.sumArray(a);
		}
		System.out.println("Suma ko�cowa dla " + wtk.getName() + " wynosi " + odp + ".");
		System.out.println(wtk.getName() + " zosta� zako�czony.");
	}
}
