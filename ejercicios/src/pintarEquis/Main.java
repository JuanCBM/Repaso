package pintarEquis;

public class Main {

	public static void main(String[] args) {

		int tamanno = 7;

		for (int i = 0; i < tamanno; i++) {

			for (int j = 0; j < tamanno; j++) {
				if (i == 0 || i == tamanno - 1) {

					System.out.print("x");
					System.out.print("\t");

				} else if (j == 0 || j == tamanno - 1) {
					System.out.print("x");
					System.out.print("\t");
				} else if (i == j) {

					System.out.print("x");
					System.out.print("\t");

				} else if (j + i == tamanno - 1) {
					System.out.print("x");
					System.out.print("\t");
				}

				else {
					System.out.print(" ");
					System.out.print("\t");
				}

			}
			System.out.println();
		}

	}

}
