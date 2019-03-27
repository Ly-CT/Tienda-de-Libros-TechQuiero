package org.TechQuieroBookStore;

import java.util.Collection;

public class Carrito {
	public static void calcular(Collection<Libro> libros) {
		double total =0;
		
		for(Libro libro : libros) {
			total += libro.precio;
			System.out.println(libro.cant + " " +libro.nombre+" "+ libro.precio + " ");
		}
		System.out.println("Total a pagar:" +total);	
		
}
}
