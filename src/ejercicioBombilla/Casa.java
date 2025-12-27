package ejercicioBombilla;

/**
 * Clase que representa una Casa con varias bombillas y un interruptor general.
 * El interruptor general puede apagar todas las bombillas y restaurar su estado anterior al encenderlo.
 */
public class Casa {

	private Bombilla primeraBombilla;
	private Bombilla segundaBombilla;
	private Bombilla terceraBombilla;
	private Bombilla cuartaBombilla;
	private Bombilla quintaBombilla;

	// Bombillas auxiliares para guardar el estado antes de apagar el interruptor general
	private Bombilla primeraBombillaFoto;
	private Bombilla segundaBombillaFoto;
	private Bombilla terceraBombillaFoto;

	public Casa() {
		primeraBombilla = new Bombilla();
		segundaBombilla = new Bombilla();
		terceraBombilla = new Bombilla();
		cuartaBombilla = new Bombilla();
		quintaBombilla = new Bombilla();
		primeraBombillaFoto = new Bombilla();
		segundaBombillaFoto = new Bombilla();
		terceraBombillaFoto = new Bombilla();
	}

	/**
	 * Muestra por consola el estado de todas las bombillas de la casa.
	 */
	public void mostrarEstado() {
		System.out.println("Bombilla 1: " + primeraBombilla.devolverEstado());
		System.out.println("Bombilla 2: " + segundaBombilla.devolverEstado());
		System.out.println("Bombilla 3: " + terceraBombilla.devolverEstado());
		System.out.println("Bombilla 4: " + cuartaBombilla.devolverEstado());
		System.out.println("Bombilla 5: " + quintaBombilla.devolverEstado());
	}

	public void encenderPrimeraBombilla() {
		primeraBombilla.setEstoyEncendido(true);
	}

	public void encenderTerceraBombilla() {
		terceraBombilla.setEstoyEncendido(true);
	}

	public void apagarPrimeraBombilla() {
		primeraBombilla.setEstoyEncendido(false);
	}

	/**
	 * Apaga el interruptor general, guardando el estado actual de las tres primeras bombillas.
	 */
	public void apagarInterruptorGeneral() {
		primeraBombillaFoto.setEstoyEncendido(primeraBombilla.isEstoyEncendido());
		segundaBombillaFoto.setEstoyEncendido(segundaBombilla.isEstoyEncendido());
		terceraBombillaFoto.setEstoyEncendido(terceraBombilla.isEstoyEncendido());
		
		primeraBombilla.setEstoyEncendido(false);
		segundaBombilla.setEstoyEncendido(false);
		terceraBombilla.setEstoyEncendido(false);
	}

	/**
	 * Enciende el interruptor general, restaurando el estado de las bombillas antes del apagado general.
	 */
	public void encenderInterruptorGeneral() {
		primeraBombilla.setEstoyEncendido(primeraBombillaFoto.isEstoyEncendido());
		segundaBombilla.setEstoyEncendido(segundaBombillaFoto.isEstoyEncendido());
		terceraBombilla.setEstoyEncendido(terceraBombillaFoto.isEstoyEncendido());
	}

	/**
	 * Enciende una bombilla específica por su número.
	 * @param i Número de la bombilla (1-3).
	 */
	public void encenderBombilla(int i) {
		if (i == 1) {
			encenderPrimeraBombilla();
		} else if (i == 2) {
			segundaBombilla.setEstoyEncendido(true);
		} else if (i == 3) {
			encenderTerceraBombilla();
		}
	}

	// Getters y Setters
	public Bombilla getPrimeraBombilla() { return primeraBombilla; }
	public void setPrimeraBombilla(Bombilla primeraBombilla) { this.primeraBombilla = primeraBombilla; }

	public Bombilla getSegundaBombilla() { return segundaBombilla; }
	public void setSegundaBombilla(Bombilla segundaBombilla) { this.segundaBombilla = segundaBombilla; }

	public Bombilla getTerceraBombilla() { return terceraBombilla; }
	public void setTerceraBombilla(Bombilla terceraBombilla) { this.terceraBombilla = terceraBombilla; }

	public Bombilla getCuartaBombilla() { return cuartaBombilla; }
	public void setCuartaBombilla(Bombilla cuartaBombilla) { this.cuartaBombilla = cuartaBombilla; }

	public Bombilla getQuintaBombilla() { return quintaBombilla; }
	public void setQuintaBombilla(Bombilla quintaBombilla) { this.quintaBombilla = quintaBombilla; }

}
