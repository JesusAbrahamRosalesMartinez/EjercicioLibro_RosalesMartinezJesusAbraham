package Recurso;

import java.util.Scanner;
import Recurso.Libro;

public class Biblioteca {
	Scanner sc = new Scanner(System.in);
	
	//Atributos
	int option;
	int CLibroAventura = 5;
	int CLibroTerror = 5;
	int CLibroRomance = 5;
	
	//Constructores
	public Biblioteca() {
		
	}
	
	//Metodos
	public void Inicio() {
	do {
		Libro menu = new Libro();
		//menu.menu();
		System.out.println("Bienvenido");
		System.out.println("Escoja una opcion");
		System.out.println("0. Salir");
		System.out.println("1. Aventura");
		System.out.println("2. Terror");
		System.out.println("3. Romance");
		System.out.println("4. Añadir libro");
		System.out.println("5. Eliminar libro");
		System.out.println("6. Mostrar numero de libros");
		int TipoLibro=sc.nextInt();
		option=TipoLibro;
		if(TipoLibro<=6) {
			switch(TipoLibro) {
				case 1:
					System.out.println("Libro de aventura");
					Libro BooksAventura = new Libro();
					BooksAventura.mostrarDetalles();
					break;
				case 2:
					System.out.println("Libro de terror");
					Libro BooksTerror = new Libro();
					BooksTerror.mostrarDetalles();
					break;
				case 3:
					System.out.println("Libro de romance");
					Libro BooksRomance = new Libro();
					BooksRomance.mostrarDetalles();
					break;
				case 4:
					System.out.println("¿Que libro desea añadir?");
					System.out.println("1. Aventura");
					System.out.println("2. Terror");
					System.out.println("3. Romance");
					int AñadirLibro = sc.nextInt();
					switch(AñadirLibro) {
					case 1:
						CLibroAventura++;
						break;
					case 2:
						CLibroTerror++;
						break;
					case 3:
						CLibroRomance++;
						break;
					}
					break;
				case 5:
					System.out.println("¿Que libro desea eliminar?");
					System.out.println("1. Aventura");
					System.out.println("2. Terror");
					System.out.println("3. Romance");
					int EliminarLibro = sc.nextInt();
					switch(EliminarLibro) {
					case 1:
						CLibroAventura--;
						break;
					case 2:
						CLibroTerror--;
						break;
					case 3:
						CLibroRomance--;
						break;
					}
					break;
				case 6:
					System.out.println("Numero de libros de aventura: " + CLibroAventura);
					System.out.println("Numero de libros de terror: " + CLibroTerror);
					System.out.println("Numero de libros de romance: " + CLibroRomance);
					break;
			}
		}else {
			System.out.println("ERROR");
		}
	}while(option>=1 & option<=6);
		System.out.println("Saliste del programa");
	}
}
