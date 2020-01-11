package W�tki;

public class MojWatek5 implements Runnable {

	// Demonstracja dzia�ania dw�ch w�tk�w o r�nych priorytetach
	
	int licznik;
	Thread wtk;
	
	static boolean stop = false;
	static String biezaca_nazwa;
	
	// Tworzenie nowego w�tku
	MojWatek5 (String nazwa) {
		licznik = 0;
		biezaca_nazwa = nazwa;
	}
	
	// Pocz�tek wykonywania nowego w�tku
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
		System.out.println(wtk.getName() + " zako�czono.");
	}
	
}
