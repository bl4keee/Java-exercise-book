package W�tki;

public class TikTak_main {

	public static void main(String[] args) {
		
		TikTak tt = new TikTak();
		
		TikTak_MojWatek mw1 = new TikTak_MojWatek("Tik", tt);
		TikTak_MojWatek mw2 = new TikTak_MojWatek("Tak", tt);
		
		try {
			mw1.wtk.join();
			mw2.wtk.join();
		} catch (InterruptedException exc) {
			System.out.println("G��wny w�tek zosta� przerwany.");
		}
		

	}

}
