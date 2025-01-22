import java.util.Scanner;

public class EjercicioIntegradorRepetitivas {

    public static void main(String[] args) {
        /*
         * Varios clientes:
         * EL programa debe solicitar por teclado dos datos:
         *   La placa del vehiculo
         *   El tipo de estacionanmiento
         */

        String placa = "";
        int tipoServicio = 0;
        int cantHoras;
        double total;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        double totalDia = 0;

        Scanner sc = new Scanner(System.in);

        /*
         * El programa debe calcular el monto a pagar para cada cliente en funcion
         * del tipo de estacionamiento seleccionado. La carga de datos debe continuar
         * hasta que el usuario ingrese la palabra "FIN" en lugar de la patente
         */

        while (!placa.equalsIgnoreCase("fin")) {
            try {
            System.out.println("Ingrese la placa de su vehiculo");
            placa = sc.nextLine();

            if (!placa.equalsIgnoreCase("fin"))
                System.out.println("Ingrese el tipo de Servicio");
                System.out.println("1 - Por hora");
                System.out.println("2 - Media Jornada (5 horas)");
                System.out.println("3 - Jornada completa (Hasta 10 horas");
                sc = new Scanner(System.in);
                tipoServicio = sc.nextInt();

                if (tipoServicio <= 0 || tipoServicio > 3) {
                    System.out.println("No ingreso un tipo de servicio correcto");
                } else {
                /* Los tpos de estacionamineto disponibles son 3:
                    -Por hora (cuyo valor es de $3 USD por hora
                    -Media jornada (cuyo valor es de $15 USD y posee ub 5% de descuento)
                    -Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
                 */

                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantHoras = sc.nextInt();
                        total = cantHoras * 3;
                        System.out.println("El total de su estacionamiento es de: $" + total + " USD");
                        cont1 = cont1 + 1;
                        totalDia = totalDia + total;

                    } else if (tipoServicio == 2) {
                        System.out.println("El servicio de media jornada corresponde a 5 hrs y posee un descuento de 5%");
                        total = 15 - (15 * 0.05); // Tan bien se puede hacer * 0.95
                        System.out.println("El total de su estacionamiento es de: $" + total + " USD");
                        cont2 = cont2 + 1;
                        totalDia = totalDia + total;

                    } else {
                        System.out.println("El servicio de media jornada corresponde a 10 hrs y posee un descuento de 5%");
                        total = 30 - (30 * 0.10);
                        System.out.println("El total de su estaciomnamiento es de: $" + total + " USD");
                        cont3 = cont3 + 1;
                        totalDia = totalDia + total;
                    }
                }
                System.out.println("*************MUCHAS GTRACIAS POR SU COMPRA!*************\n");

        } catch (NumberFormatException e) {
            System.out.println("Error de entrada: Debe ingresar un número para el tipo de servicio y cantidad de horas.");
        }
        }

        System.out.println("===============================================================");
        System.out.println("Totales Monetarios por dia");
        System.out.println("Cantidad servicios por Hora: " + cont1);
        System.out.println("Cantidad servicios por Media jornada: " + cont2);
        System.out.println("Cantidad servicios por Jornada completa: " + cont3);
        System.out.println("El monto total recaudado por dia es de: $" + totalDia + " USD ");
    }
}