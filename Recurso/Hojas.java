package Recurso;

public class Hojas {
	public String gTexto;
	public int gNoPagina = 0;
	public String gCapitulo;
	public float gInterlineado;
	
	public Hojas(String pTexto, int pNoPagina, String pCapitulo, float pInterlineado) {
		this.gTexto = pTexto;
		this.gNoPagina = pNoPagina;
		this.gCapitulo = pCapitulo;
		this.gInterlineado = pInterlineado;
	}
	public void fijarCapitulo() {
		System.out.println("El capitulo seleccionado es: " +gCapitulo);
	}
	public void fijarPagina() {
		System.out.println("La pagina seleccionado es: " +gNoPagina);
	}
	
	/*public void crearHojas(int pNoPagina) {
		this.contenido = new Hoja[pNoPagina];
		for(int n=0; n<pNoPagina; n++) {
			this.contenido[n] = new Hoja();
		}
	}*/
}
