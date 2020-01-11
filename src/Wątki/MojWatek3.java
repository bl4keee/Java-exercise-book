package W�tki;

public class MojWatek3 implements Runnable {

	int licznik;
	Thread wtk;
	
	// Tworzenie nowego w�tku, konstruktor
	MojWatek3 (String name) {
		wtk = new Thread(this, name);
		licznik = 0;
		wtk.start();
	}
	
	// Pocz�tek wykonywania nowego w�tku
	public void run() {
		System.out.println(wtk.getName() + " startuje.");
		
		try {
			do {
				Thread.sleep(500);
				System.out.println(wtk.getName() + ", licznik = " + licznik);
				licznik++;
			} while (licznik < 10);
		} catch (InterruptedException exc) {
			System.out.println(wtk.getName() + " przerwany.");
		}
		System.out.println(wtk.getName() + " zako�czony.");
}
}
