class Automovil {
    private double valor;
    private boolean esServicioPublico;
    private boolean esDeOtraProvincia;
    private boolean pagoAlContado;
    private int aniosDiferimiento;

    public Automovil(double valor, boolean esServicioPublico, boolean esDeOtraProvincia, boolean pagoAlContado, int aniosDiferimiento) {
        this.valor = valor;
        this.esServicioPublico = esServicioPublico;
        this.esDeOtraProvincia = esDeOtraProvincia;
        this.pagoAlContado = pagoAlContado;
        this.aniosDiferimiento = aniosDiferimiento;
    }

    public double getValor() {
        return valor;
    }

    public boolean esServicioPublico() {
        return esServicioPublico;
    }

    public boolean esDeOtraProvincia() {
        return esDeOtraProvincia;
    }

    public boolean esPagoAlContado() {
        return pagoAlContado;
    }

    public int getAniosDiferimiento() {
        return aniosDiferimiento;
    }
}