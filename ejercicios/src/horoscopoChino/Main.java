package horoscopoChino;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int anio = 2000;
		System.out.println("Año " + anio);

		int compAnimal = anio % 12;
		int elemento = anio % 10;// 7

		if (compAnimal == 0) {
			System.out.println("eres mono");
		} else if (compAnimal == 1) {
			System.out.println("Eres un gallo");
		} else if (compAnimal == 2) {
			System.out.println("Eres un perro");
		} else {
			System.out.println("Pendiente de implementacion");
		}

		if (elemento >= 0 && elemento <= 1) {
			System.out.println("Metal");
		} else if (elemento >= 2 && elemento <= 3) {
			System.out.println("Agua");
		} else {
			System.out.println("Pendiente de implementacion");
		}

	}

}
