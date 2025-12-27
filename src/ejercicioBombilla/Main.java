package EjercicioBombilla;

public class MainEjer7 {
  public static void main(String[] args) {
    Casa casa = new Casa();

    casa.mostrarEstado();
    casa.encenderPrimeraBombilla();
    casa.encenderTerceraBombilla();
    System.out.println();
    casa.mostrarEstado();
    casa.apagarPrimeraBombilla();
    System.out.println();
    casa.mostrarEstado();
    casa.apagarInterruptorGeneral();
    System.out.println();
    casa.mostrarEstado();
    System.out.println();
    casa.encenderInterruptorGeneral();
    casa.mostrarEstado();
    casa.encenderBombilla(1);
    casa.mostrarEstado();
  }
}
