class CalculadorImpuestos {
    private static final double DESCUENTO_PRONTO_PAGO = 0.10;
    private static final double DESCUENTO_SERVICIO_PUBLICO = 0.15;
    private static final double DESCUENTO_TRASLADO_CUENTA = 0.15;

    public double calcularImpuestos(Automovil automovil) {
        double valor = automovil.getValor();

        // Aplicar descuento por pronto pago
        if (automovil.esPagoAlContado()) {
            valor -= valor * DESCUENTO_PRONTO_PAGO;
        } else {
            int anios = automovil.getAniosDiferimiento();
            double descuentoAjustado = DESCUENTO_PRONTO_PAGO - (anios * 0.01);
            if (descuentoAjustado < 0) descuentoAjustado = 0;
            valor -= valor * descuentoAjustado;
        }

        // Aplicar descuento por servicio público si aplica
        if (automovil.esServicioPublico()) {
            valor -= valor * DESCUENTO_SERVICIO_PUBLICO;
        }

        // Aplicar descuento por traslado de cuenta si aplica
        if (automovil.esDeOtraProvincia()) {
            valor -= valor * DESCUENTO_TRASLADO_CUENTA;
        }

        return valor;
    }
}