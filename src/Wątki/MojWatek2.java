package W¹tki;

public class MojWatek2 implements Runnable {
	
	int licznik;
	String nazwa_watku;
	
	MojWatek2(String nazwa) {
		licznik = 0;
		nazwa_watku = nazwa;
	}
	
	// punkt wejœcia w¹tku - w¹tek rozpoczyna wykonywanie
	public void run() {
		System.out.println(nazwa_watku + " startuje.");
		try {
			do {
				Thread.sleep(500);
				System.out.println(nazwa_watku + ", licznik = " + licznik);
				licznik++;
			} while (licznik < 10);
			} catch (InterruptedException exc ) {
				System.out.println(nazwa_watku + " przerwany.");
			}
		System.out.println(nazwa_watku + " zakoñczony.");
		}
}


