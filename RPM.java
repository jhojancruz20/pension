public class RPM extends RegimenPensional {
    @Override
    public double calcularAporteMensual(double salario) {
        return salario * 0.16;
    }

    @Override
    public double simularPension(double saldoAcumulado, int semanasCotizadas, double salarioPromedio) {
        double porcentajePension = 0.65;
        if (semanasCotizadas > 1300) {
            porcentajePension += 0.015 * ((semanasCotizadas - 1300) / 50);
            porcentajePension = Math.min(porcentajePension, 0.8); // Máximo 80%
        }
        return salarioPromedio * porcentajePension;
    }
}

