package Tablice;
import java.util.*;

public class Zadanie_417_ArrayList {

	public static void main(String[] args) {
		
		// ArrayList creation
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(20);
		lista.add(51);
		lista.add(-72);
		lista.add(4);
		lista.add(14);
		lista.add(-4);
		
		// Unsorted list
		System.out.println("Elementy nieposortowane.");
		
		for (int i = 0; i < lista.size(); i++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
		
		// Sorting the list
		Collections.sort(lista);
		System.out.println("Elementy posortowane.");
		
		for (int i = 0; i < lista.size(); i++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
		
		// Removing the 2nd element from the list
		lista.remove(1);
		System.out.println("Usuniêto drugi element z listy i dodano nowy element do listy.");
		lista.add(10);
		System.out.println("Elementy nieposortowane po usuniêciu z listy i dodaniu nowego elementu.");
		
		for (int i = 0; i < lista.size(); i ++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		
		// Sorting the list again (after removing 2nd element and adding another one)
		Collections.sort(lista);
		System.out.println();
		System.out.println("Ponowne sortowanie listy.");
		
		for (int i = 0; i < lista.size(); i ++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
	}

}
