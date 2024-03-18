package cafetera;

import java.util.Scanner;

import clases.Cafetera;

public class Main {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		Cafetera cafetera = new Cafetera();
		do {

			System.out.println("Antes: " + cafetera.getCantidadActual());
			if(cafetera.getCantidadActual() == 0) {
				cafetera.llenarCafetera();
			}
			System.out.println("Despues: " + cafetera.getCantidadActual());

			int cantidadDeseada;
			do {
				System.out.println("Ingrese la cantidad de café deseada:");
				cantidadDeseada = lector.nextInt();
				cafetera.servirTaza(cantidadDeseada);
				System.out.println("Café restante en la cafetera: " + cafetera.getCantidadActual());

			} while (cafetera.getCantidadActual() >= cantidadDeseada);

			System.out.println("Ingrese la cantidad de cafe a reponer: ");
			cafetera.agregarCafe(lector.nextInt());
			System.out.println("La cantidad de cafe actual es: " + cafetera.getCantidadActual());
			System.out.println("Desea servir más café?");
			System.out.println("Responda: Si o No");
		} while (lector.next() != "Si");
		lector.close();
	}

}
