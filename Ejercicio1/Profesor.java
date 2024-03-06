public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String genero, String asignatura) {
        super(nombre, edad, genero);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String generarSaludo(){
        return "Hola, me llamo " + nombre + ", y doy la assignatura de " + asignatura;
    }

    
    
}
