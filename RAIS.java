public class RAIS extends RegimenPensional {
    @Override
    public double calcularAporteMensual(double salario) {
        return salario * 0.16;
    }

    @Override
    public double simularPension(double saldoAcumulado, int semanasCotizadas, double salarioPromedio) {
        int expectativaDeVida = 20; // Suponiendo una expectativa de vida de 20 años después de la jubilación
        return saldoAcumulado / (expectativaDeVida * 12); // Pensión mensual
    }
}
