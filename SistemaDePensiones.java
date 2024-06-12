import java.util.ArrayList;

public class SistemaDePensiones {
    public static void main(String[] args) {
    }
    private ArrayList<Trabajador> trabajadores;

    public SistemaDePensiones() {
        this.trabajadores = new ArrayList<>();
    }

    // RF1: Afiliación
    public void afiliarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    // RF2: Cálculo de Aportes
    public double calcularAporteMensual(Trabajador trabajador) {
        return trabajador.getRegimenPensional().calcularAporteMensual(trabajador.getSalario());
    }

    // RF3: Simulación de Pensiones
    public double simularPension(Trabajador trabajador, double saldoAcumulado, int semanasCotizadas, double salarioPromedio) {
        return trabajador.getRegimenPensional().simularPension(saldoAcumulado, semanasCotizadas, salarioPromedio);
    }

    // Método para obtener la lista de trabajadores
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
}
