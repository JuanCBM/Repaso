package centroComercial;

/**
 * Clase que representa una Tienda dentro de un Centro Comercial.
 * Almacena información sobre ventas, rebajas y estados de ventas.
 */
public class Tienda {

	private boolean rebajasActivas;
	private String nombre;
	private int ventaTotal;
	private int porcentajeRebaja;
	private int ventaTotalInicial;
	
	public Tienda(String nombre, int ventaTotal) {
		this.nombre = nombre;
		this.ventaTotal = ventaTotal;
		this.rebajasActivas = false;
		this.porcentajeRebaja = 0;
	}

	// Getters y Setters
	public int getVentaTotal() { return ventaTotal; }
	public void setVentaTotal(int ventaTotal) { this.ventaTotal = ventaTotal; }

	public boolean isRebajasActivas() { return rebajasActivas; }
	public void setRebajasActivas(boolean rebajasActivas) { this.rebajasActivas = rebajasActivas; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public int getPorcentajeRebaja() { return porcentajeRebaja; }
	public void setPorcentajeRebaja(int porcentajeRebaja) { this.porcentajeRebaja = porcentajeRebaja; }

	public int getVentaTotalInicial() { return ventaTotalInicial; }
	public void setVentaTotalInicial(int ventaTotalInicial) { this.ventaTotalInicial = ventaTotalInicial; }

	@Override
	public String toString() {
		return "Tienda [Nombre=" + nombre + ", Ventas=" + ventaTotal + 
               ", Rebajas Activas=" + rebajasActivas + ", % Rebaja=" + porcentajeRebaja + "]";
	}
}
