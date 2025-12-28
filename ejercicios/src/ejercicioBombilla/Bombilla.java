package ejercicioBombilla;

/**
 * Clase que representa una Bombilla individual.
 * Puede estar encendida o apagada.
 */
public class Bombilla {

  private boolean estoyEncendido;

  public Bombilla() {
    estoyEncendido = false;
  }

  public boolean isEstoyEncendido() {
    return estoyEncendido;
  }

  public void setEstoyEncendido(boolean estoyEncendido) {
    this.estoyEncendido = estoyEncendido;
  }
  
  /**
   * Devuelve una representación visual del estado de la bombilla.
   * @return "o" si está encendida, "x" si está apagada.
   */
  public String devolverEstado() {
    if (isEstoyEncendido()) {
      return "o";
    }
    return "x";
  }
}
