public abstract class RegimenPensional {
    public abstract double calcularAporteMensual(double salario);
    public abstract double simularPension(double saldoAcumulado, int semanasCotizadas, double salarioPromedio);
}
