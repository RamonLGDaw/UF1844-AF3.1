
public abstract class Persona {

    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    abstract String generarSaludo();

    public Boolean verificarMayorEdad() {
        return (this.edad >= 18);
    }

    public short edadEnBisiestos() {

        if (this.edad < 4) {
            return 0;
        } else {
            return ((short) Math.floor(edad / 4));
        }
    }

    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}