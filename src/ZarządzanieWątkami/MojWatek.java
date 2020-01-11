package Zarz�dzanieW�tkami;

public class MojWatek implements Runnable {
	
	Thread wtk;
	volatile boolean zawieszony; // flaga; 
	volatile boolean zatrzymany; // flaga
	/*
	 Volatile - informuje kompilator, �e w�tki odczytuj�ce warto�� takiej
	 zmiennej zasze powinny widzie� jej aktualn� warto�� i �e powina by� 
	 zachowana kolejno�� operacji na tej zmiennej wynikaj�ca z kodu programu
	 */
	
	MojWatek (String nazwa) {
		wtk = new Thread (this, nazwa);
		zawieszony = false;
		zatrzymany = false;
		wtk.start();
	}
	
	// W�tek startuje
	public void run() { 
		System.out.println(wtk.getName() + " startuje.");
		try {
			for (int i = 1; i < 1000; i ++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				// blok synchronized aby sprawdzi� flagi - zawieszony i zatrzymany
				synchronized (this) {
					while (zawieszony) {
						wait();
					}
					if (zatrzymany) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(wtk.getName() + " zosta� przerwany.");
		}
		System.out.println(wtk.getName() + " si� zako�czy�.");
	}

	// zako�czenie w�tku
	synchronized void moj_zatrzymany() { // umo�liwa zatrzymanemu w�tkowi zako�czenie dzia�ania 
		zatrzymany = true;
		zawieszony = false;
		notify();
	}
	
	// zawieszenie w�tku
	synchronized void moj_zawieszony() { 
		zawieszony = true;
	}
	
	// wznowienie w�tku
	synchronized void moj_wznowiony() {
		zawieszony = false;
		notify();
	}
}

