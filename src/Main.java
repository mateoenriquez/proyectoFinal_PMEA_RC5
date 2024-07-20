public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Ingresar valor del automóvil
        System.out.print("Ingrese el valor del automóvil (15000 - 100000): ");
        double valor = scanner.nextDouble();

        // Verificar rango del valor ingresado
        if (valor < 15000 || valor > 100000) {
            System.out.println("Valor del automóvil fuera de rango.");
            return;
        }

        // Ingresar tipo de automóvil
        System.out.print("Es un automóvil de servicio público? (true/false): ");
        boolean esServicioPublico = scanner.nextBoolean();

        // Ingresar origen del vehículo
        System.out.print("El vehículo es de otra provincia? (true/false): ");
        boolean esDeOtraProvincia = scanner.nextBoolean();

        // Ingresar método de pago
        System.out.print("Pagará al contado? (true/false): ");
        boolean pagoAlContado = scanner.nextBoolean();

        int aniosDiferimiento = 0;
        if (!pagoAlContado) {
            System.out.print("A cuántos años diferirá el pago?: ");
            aniosDiferimiento = scanner.nextInt();
        }

        // Crear objeto Automovil
        Automovil automovil = new Automovil(valor, esServicioPublico, esDeOtraProvincia, pagoAlContado, aniosDiferimiento);

        // Calcular impuestos
        CalculadorImpuestos calculador = new CalculadorImpuestos();
        double impuestos = calculador.calcularImpuestos(automovil);

        // Mostrar resultado
        System.out.printf("El valor de los impuestos es: %.2f\n", impuestos);
    }
}