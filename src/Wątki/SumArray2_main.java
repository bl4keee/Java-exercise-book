package W�tki;

public class SumArray2_main {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		
		SumArray_mojWatek2 mt1 = new SumArray_mojWatek2("W�tek 1", a);
		SumArray_mojWatek2 mt2 = new SumArray_mojWatek2("W�tek 2", a);
		
		try {
			mt1.wtk.join();
			mt2.wtk.join();
		} catch (InterruptedException exc) {
			System.out.println("G��wny w�tek zosta� przerwany.");
		}
	}
}
