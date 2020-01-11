package W¹tki;

public class SumArray2 {

	private int suma;
	
	synchronized int sumArray2(int liczby[]) {
		suma = 0;
		for (int i = 0; i < liczby.length; i ++) {
			suma += liczby[i];
			System.out.println("Bie¿¹ca wartoœæ sumy dla " + 
			Thread.currentThread().getName() + " wynosi " + suma + ".");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException exc) {
				System.out.println("G³ówny w¹tek zosta³ przerwany.");
			}
		}
		return suma;
	}
}
