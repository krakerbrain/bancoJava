package clases;

public class Cafetera {
	private int capacidadMaxima = 1000;
	private int cantidadActual = 0;

	// Alt + Shift + S + O
	// Shortcute constructores
	public Cafetera() {
	}

	/**
	 * @param capacidadMaxima
	 * @param cantidadActual
	 */
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	//	Alt + Shift + S + R
	// Shortcute getter and setters

	/**
	 * @return the capacidadMaxima
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	/**
	 * @param capacidadMaxima the capacidadMaxima to set
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	/**
	 * @return the cantidadActual
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}

	/**
	 * @param cantidadActual the cantidadActual to set
	 */
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public void llenarCafetera() {
		setCantidadActual(getCapacidadMaxima());
	}
	
	public void servirTaza(int tamanoTaza) {
		System.out.println("Sirviendo taza de: " + tamanoTaza);
		
		if(getCantidadActual() < tamanoTaza) {
			System.out.println("La taza ha sido llenada con: " + getCantidadActual());
			vaciarCafetera();			
		}else {			
			setCantidadActual(getCantidadActual() - tamanoTaza);			
			System.out.println("La taza ha sido llenada");
			System.out.println("Cafe restante: " + getCantidadActual());
		}		
	}
	public void vaciarCafetera() {
		setCantidadActual(0);
		System.out.println("La cafetera ha sido vaciada!!");
	}
	
	public void agregarCafe(int reposicion) {
		setCantidadActual(reposicion);
	}
	
	
}
