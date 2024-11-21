import java.io.IOException;
import java.util.Scanner;

public class TasaCambio {
  public static void cambio(String monedaBase, String monedaTarget, PrincipalBusqueda consulta, Scanner lectura) throws IOException, InterruptedException {
      double cantidad;
      double divisa;
      Moneda moneda = consulta.buscaMoneda(monedaBase, monedaTarget);
      System.out.println("La Tasa de cambio al día de hoy\n1 "+monedaBase+" = "+moneda.convercion_rate()+" "+monedaTarget);
      System.out.println("Ingresa el monto:  " +monedaBase);
      cantidad = Double.parseDouble(lectura.nextLine());
      divisa = cantidad * moneda.convercion_rate();
      System.out.println(cantidad+" "+monedaBase +" = " +divisa + " " + moneda.target_code());

  }
}
