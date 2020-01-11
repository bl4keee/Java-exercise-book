package Zarz¹dzanieW¹tkami;

public class MojWatek implements Runnable {
	
	Thread wtk;
	volatile boolean zawieszony; // flaga; 
	volatile boolean zatrzymany; // flaga
	/*
	 Volatile - informuje kompilator, ¿e w¹tki odczytuj¹ce wartoœæ takiej
	 zmiennej zasze powinny widzieæ jej aktualn¹ wartoœæ i ¿e powina byæ 
	 zachowana kolejnoœæ operacji na tej zmiennej wynikaj¹ca z kodu programu
	 */
	
	MojWatek (String nazwa) {
		wtk = new Thread (this, nazwa);
		zawieszony = false;
		zatrzymany = false;
		wtk.start();
	}
	
	// W¹tek startuje
	public void run() { 
		System.out.println(wtk.getName() + " startuje.");
		try {
			for (int i = 1; i < 1000; i ++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				// blok synchronized aby sprawdziæ flagi - zawieszony i zatrzymany
				synchronized (this) {
					while (zawieszony) {
						wait();
					}
					if (zatrzymany) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(wtk.getName() + " zosta³ przerwany.");
		}
		System.out.println(wtk.getName() + " siê zakoñczy³.");
	}

	// zakoñczenie w¹tku
	synchronized void moj_zatrzymany() { // umo¿liwa zatrzymanemu w¹tkowi zakoñczenie dzia³ania 
		zatrzymany = true;
		zawieszony = false;
		notify();
	}
	
	// zawieszenie w¹tku
	synchronized void moj_zawieszony() { 
		zawieszony = true;
	}
	
	// wznowienie w¹tku
	synchronized void moj_wznowiony() {
		zawieszony = false;
		notify();
	}
}

