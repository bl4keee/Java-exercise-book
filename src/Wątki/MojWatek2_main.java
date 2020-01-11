package W�tki;

public class MojWatek2_main {

	public static void main(String[] args) {
		
		System.out.println("M�j w�tek startuje.");
		
		// Obiekt typu M�jW�tek2, obiekt z zaimplementowanym Runnable
		MojWatek2 mw = new MojWatek2("W�tek 1");
		
		// Tworzymy w�tek z tego obiektu
		Thread NowyW�tek = new Thread(mw);
		
		// Pocz�tek wykonywania si� w�tku
		NowyW�tek.start();
		
		
		do {
			try {
				Thread.sleep(100); // zawieszenie na 100 milisekund
			} catch (InterruptedException exc) {
				System.out.println("G��wny w�tek zosta� przerwany.");
			}
		} while (mw.licznik != 10);
		System.out.println("G��wny w�tek zosta� zako�czony.");
	}

}
