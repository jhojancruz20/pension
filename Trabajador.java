public class Trabajador extends Persona {
    private double salario;
    private RegimenPensional regimenPensional;

    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimenPensional) {
        super(nombre, identificacion, tipoTrabajador);
        this.salario = salario;
        this.regimenPensional = regimenPensional;
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public RegimenPensional getRegimenPensional() {
        return regimenPensional;
    }
}


