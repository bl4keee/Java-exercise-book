package W¹tki;

public class MojWatek5 implements Runnable {

	// Demonstracja dzia³ania dwóch w¹tków o ró¿nych priorytetach
	
	int licznik;
	Thread wtk;
	
	static boolean stop = false;
	static String biezaca_nazwa;
	
	// Tworzenie nowego w¹tku
	MojWatek5 (String nazwa) {
		licznik = 0;
		biezaca_nazwa = nazwa;
	}
	
	// Pocz¹tek wykonywania nowego w¹tku
	public void run() {
		System.out.println(wtk.getName() + " startuje.");
		do {
			licznik++;
			if (biezaca_nazwa != wtk.getName()) {
				biezaca_nazwa = wtk.getName();
				System.out.println(biezaca_nazwa);
			}
		} while (stop == false && licznik < 1000);
		stop = true;
		System.out.println(wtk.getName() + " zakoñczono.");
	}
	
}
