package main;

import java.util.ArrayList;
import java.util.Collections;

import models.ListaOrdenada;

public class Prueba {

	public static void main(String[] args) {

		
		ArrayList<Integer> listas= new ListaOrdenada<Integer>((Integer b, Integer a)->b-a);
	
		listas.add(3);
		listas.add(293);
		listas.add(23);
		listas.add(1);
		
		Collections.sort(listas);
		System.out.println(listas);

		
	}

}
