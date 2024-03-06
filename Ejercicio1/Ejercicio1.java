import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Polimorfismo
        // Abstracción 
        // SobreCarga de métodos.

        ArrayList<Persona> personasArray = new ArrayList<>();
        // Persona Carlos = new Persona("Carlos", 43, "Hombre"); Mensaje de error que no
        // puede instanciar a Persona

        Estudiante ramon = new Estudiante("Ramon", 43, "Hombre", "Certificado de profesionalidad");

        System.out.println(ramon.generarSaludo());

        Profesor martin = new Profesor("Martin", 40, "Hombre", "Literatura");

        System.out.println(martin.generarSaludo());

        System.out.println("Edad de profesor en bisiestos: " + martin.edadEnBisiestos());

        personasArray.add(ramon);
        personasArray.add(martin);

        for (int index = 0; index < personasArray.size(); index++) {
            System.out.println(personasArray.get(index).generarSaludo());
        }

    }
}
