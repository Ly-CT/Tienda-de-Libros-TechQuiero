package org.TechQuieroBookStore;

import java.util.*;
public class Main {
	
	
	private static Scanner sc;
	private Map<Integer, Libro> listaLibros = new HashMap<>();
	private Collection<Libro> libros;

	Carrito car = new Carrito();

	public static void main(String[] args) {
		Main miMain = new Main();
		miMain.cargarDato();
		miMain.ejecutarPrograma();

	}

	public void ejecutarPrograma() {
		sc = new Scanner(System.in);
		this.libros = new ArrayList<>();
		System.out.println("<<<-------Librería Tech Quiero------->>>");
		System.out.println(" ");
		System.out.println("Nuestros libros disponibles:");
		this.mostrarLibros();
		System.out.println(" ");
		System.out.println("¿Cuántos libros vas a comprar?");
		int cantidad = sc.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Elija su libro: ");		
			if (sc.hasNextInt()) {
				Integer cantidd = sc.nextInt();
				Libro libroElegido = listaLibros.get(cantidd);
				this.libros.add(libroElegido);
			}else {
				System.out.println("por favor escoja un numero de libro");
			}
		}
		Carrito.calcular(libros);

	}
	

	public void mostrarLibros() {
		Collection<Libro> libros = listaLibros.values();
		for (Libro libro : libros) {
			System.out.println("    "+ libro.getNum() + ".-" + " Nombre: " + libro.nombre + " Autor: " + libro.autor
					+ " Precio: " + libro.precio);
		}
	}

	
	
	
	public void cargarDato() {

		Libro stackOne = new Libro();
		stackOne.setNombre("Microservicios");
		stackOne.setAutor("Christian Posta");
		stackOne.setPrecio(45.98);
		stackOne.setNum(1);
		listaLibros.put(1, stackOne);

		Libro stackTwo = new Libro();
		stackTwo.setNombre("Patrones de diseno");
		stackTwo.setAutor("Markus Eisele");
		stackTwo.setPrecio(72.80);
		stackTwo.setNum(2);
		listaLibros.put(2, stackTwo);

		Libro stackThree = new Libro();
		stackThree.setNombre("Programación Orientada a Objetos");
		stackThree.setAutor("Richard Warbuton:");
		stackThree.setPrecio(36.72);
		stackThree.setNum(3);
		listaLibros.put(3, stackThree);

		Libro stackFour = new Libro();
		stackFour.setNombre("Aprendiendo Java:");
		stackFour.setAutor("Ben Evans");
		stackFour.setPrecio(66.81);
		stackFour.setNum(4);
		listaLibros.put(4, stackFour);

		Libro stackFive = new Libro();
		stackFive.setNombre("Aprendiendo Python:");
		stackFive.setAutor("David Mertz:");
		stackFive.setPrecio(43.27);
		stackFive.setNum(5);
		listaLibros.put(5, stackFive);

		Libro stackSix = new Libro();
		stackSix.setNombre("Big Data con Hadoop");
		stackSix.setAutor("Donald Miner");
		stackSix.setPrecio(39.60);
		stackSix.setNum(6);
		listaLibros.put(6, stackSix);

		Libro stackSeven = new Libro();
		stackSeven.setNombre("IOS con Swift:");
		stackSeven.setAutor("Tim Nugent:");
		stackSeven.setPrecio(24.18);
		stackSeven.setNum(7);
		listaLibros.put(7, stackSeven);

		Libro stackEight = new Libro();
		stackEight.setNombre("Programación Reactiva");
		stackEight.setAutor("Konrad Malawski");
		stackEight.setPrecio(58.70);
		stackEight.setNum(8);
		listaLibros.put(8, stackEight);

		Libro stackNine = new Libro();
		stackNine.setNombre("Programación con C");
		stackNine.setAutor("Joel Falcou:");
		stackNine.setPrecio(67.93);
		stackNine.setNum(9);
		listaLibros.put(9, stackNine);

		Libro stackTen = new Libro();
		stackTen.setNombre("Diseño de Sistemas");
		stackTen.setAutor(" Doug Davis");
		stackTen.setPrecio(55.67);
		stackTen.setNum(10);
		listaLibros.put(10, stackTen);

	}


		
		
}
