package Tablice;
import java.util.*;

public class Zadanie_418_ArrayList {

	public static void main(String[] args) {
		
		// Declarations
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Julia");
		lista.add("Agata");
		lista.add("Zenek");
		lista.add("Jarek");
		lista.add("Kasia");
		lista.add("Dominika");

		// Printing unsorted list
		System.out.println("Nieposortowane elementy.");
		
		for (int i = 0; i < lista.size(); i ++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
		
		// Sorting the list and printing it
		Collections.sort(lista);
		System.out.println("Elementy posortowane.");
		
		for (int i = 0; i < lista.size(); i ++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
		
		// Removing 2nd element from the list and adding another one
		lista.remove(1);
		System.out.println("Drugi element zosta³ usuniêty i zosta³ dodany nowy.");
		lista.add("Adam");
		System.out.println("Nieposortowane elementy po usuniêciu drugiego i dodaniu nowego.");
		
		for (int i = 0; i < lista.size(); i ++) {
			if (i < lista.size() - 1) {
				System.out.print(lista.get(i) + ", ");
			} else {
				System.out.print(lista.get(i) + ".");
			}
		}
		System.out.println();
		
		// Sorting the list again (after removing 2nd element and adding another one)
		Collections.sort(lista);
		System.out.println("Elementy ponownie posortowane.");
		
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
