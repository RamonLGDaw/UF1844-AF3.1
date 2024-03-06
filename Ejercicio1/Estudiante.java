

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String genero, String curso) {
        super(nombre, edad, genero);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String generarSaludo() {
        return "Hola, me llamo " + nombre + " y estoy cursando " + curso;
    }

}
