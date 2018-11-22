package sampleExos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListOrSet {

	public static void main(String[] args) {
		List<Integer> scores1 = new LinkedList<>(); // ajoute dans l'ordre d'insertion
		Set<Integer> scores2 = new HashSet<>(); // n'ajoute pas les doublons
		TreeSet<Integer> scores3 = new TreeSet<>(); //Les elements sont ordonnés

		int tirage;
		for (int i = 0; i < 10; i++) {
			tirage = (int) (Math.random() * 20);
			scores1.add(tirage);
			scores2.add(tirage);
			scores3.add(tirage);
		}

		System.out.println("List : " + scores1.toString());
		System.out.println("Set : " + scores2.toString());
		System.out.println("TreeSet : " + scores3.toString());

	}

}
