

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        PrincipalBusqueda consulta = new PrincipalBusqueda();
        int opcion = 0;
        while(opcion !=7){
            System.out.println("************************\n" +
                                "Calculadora de Divisas\n\n" +
                                "Ingrese el número de la opción deseada\n\n" +
                                "1.- Dollar a peso Argentino\n" +
                                "2.- Peso Argentino a Dollar\n" +
                                "3.- Dollar a Real Brasileño\n" +
                                "4.- Real Brasileño a Dollar\n" +
                                "5.- Dollar a peso Colombiano\n" +
                                "6.- Peso colombiano a Dollar\n" +
                                "7.- Salir"
                              );
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion){
                case 1:
                   TasaCambio.cambio("USD", "ARS", consulta, lectura);
                   break;
                case 2:
                    TasaCambio.cambio("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    TasaCambio.cambio("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    TasaCambio.cambio("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    TasaCambio.cambio("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    TasaCambio.cambio("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("FIN...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        }
    }
}
