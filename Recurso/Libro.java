package Recurso;

import java.util.Scanner;

public class Libro {
	
	Scanner sc = new Scanner(System.in);
	
	//Atributos
	int NumPags;
	int goption;
	/*public String gAutor;
	public String gTitulo;
	public int gNumpaginas;
	private int gPaginaActual = 0;*/
	
	//Constructor
	/*public Libro(String pAutor, String pTitulo, int pNumpaginas){
		this.gAutor = pAutor;
		this.gNumpaginas = pNumpaginas;
		this.gTitulo = pTitulo;
	}*/
	
	//Metodos
	public void mostrarDetalles() {
		System.out.println("Escriba el titulo del libro: ");
		String Titulo = sc.nextLine();
		System.out.println("Escriba el autor del libro: ");
		String Autor = sc.nextLine();
		System.out.println("Escriba el numero de paginas: ");
		int NumPags = sc.nextInt();
		System.out.println("Conteo de paginas");
		for(int i=0; i<=NumPags; i++) {
			System.out.println("Pagina: " +i);
		}
	}
	public void menu() {
		do {
			System.out.println("Bienvenido");
			System.out.println("0. Salir");
			System.out.println("1. Libro Aventura");
			System.out.println("2. Libro Terror");
			System.out.println("3. Libro Romance");
			System.out.println("4. Añadir libro");
			System.out.println("5. Eliminar libro");
			System.out.println("6. Mostrar numero de libros");
			System.out.println("Selccione una opcion: ");
			int option = sc.nextInt();
			goption=option;
			if(option>6 | option<0) {
				System.out.println("Error");
			}
		}while(goption>0 | goption<=6);
	}
	/*public void mostrarDetalles(){
		System.out.println("El titulo del libro es: " + this.gTitulo);
		System.out.println("El autor del libro es: " + this.gAutor);
		System.out.println("El numero de paginas es: " + Integer.toString(this.gNumpaginas));
	}*/
	
	/*public void avanzarPagina() {
		if(this.gPaginaActual <= this.gNumpaginas) {
			System.out.println(Integer.toString(this.gPaginaActual));
			this.gPaginaActual++;
		}
	}*/
	
	
	/*public void crearHojas(int pNoPagina) {
	Hojas this.contenido = new Hojas[pNoPagina];
	for(int n=0; n<pNoPagina; n++) {
		this.contenido[n] = new Hoja();
		}
	}*/
}
