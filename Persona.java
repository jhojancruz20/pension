public class Persona {
    private String nombre;
    private String identificacion;
    private String tipoTrabajador; // dependiente o independiente

    public Persona(String nombre, String identificacion, String tipoTrabajador) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTrabajador = tipoTrabajador;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }
}









