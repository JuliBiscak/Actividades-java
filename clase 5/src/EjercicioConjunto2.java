public class EjercicioConjunto2 {

    public static void main(String[] args) {
        ConjuntoTDA alumnos = new ConjuntoTDA();
        alumnos.InicializarConjunto();

        // El alumno 102 se anota por primera vez
        alumnos.Agregar(102);

        // El mismo alumno se quiere anotar a otra carrera.
        // Preguntamos si su ID ya pertenece al conjunto.
        if (alumnos.Pertenece(102)) {
            System.out.println("El alumno 102 ya existe. No se duplica su ID.");
        } else {
            alumnos.Agregar(102);
            System.out.println("El alumno 102 fue agregado.");
        }

        alumnos.Agregar(103);
        alumnos.Agregar(104);

        // Elegir devuelve un elemento, pero NO lo elimina
        int elemento1 = alumnos.Elegir();
        System.out.println("Primer Elegir: " + elemento1);

        // Volvemos a llamar a Elegir sin haber usado Sacar
        int elemento2 = alumnos.Elegir();
        System.out.println("Segundo Elegir: " + elemento2);

        // Elegimos un elemento
        int elegido = alumnos.Elegir();

        // Ahora sí lo eliminamos usando Sacar
        alumnos.Sacar(elegido);

        System.out.println("Elemento eliminado con Sacar: " + elegido);

        // Comprobamos si sigue perteneciendo al conjunto
        if (alumnos.Pertenece(elegido)) {
            System.out.println("El elemento sigue en el conjunto.");
        } else {
            System.out.println("El elemento ya no pertenece al conjunto.");
        }
    }
}