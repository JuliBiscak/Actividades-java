public class Ejercicio5 {

    static int sumar(ColaTDA5 c) {

        ColaTDA5 aux = new ColaTDA5();
        aux.InicializarCola();

        int suma = 0;

        // sumamos los elementos
        while (!c.ColaVacia()) {

            int elemento = c.Primero();

            suma = suma + elemento;

            aux.Acolar(elemento);

            c.Desacolar();
        }


        while (!aux.ColaVacia()) {

            int elemento = aux.Primero();

            c.Acolar(elemento);

            aux.Desacolar();
        }

        return suma;
    }


    public static void main(String[] args) {

        ColaTDA5 c = new ColaTDA5();
        c.InicializarCola();

        //EJEMPLO de la consigna
        c.Acolar(3);
        c.Acolar(8);
        c.Acolar(4);
        c.Acolar(10);

        int resultado = sumar(c);

        System.out.println("La suma es: " + resultado);


        System.out.println("El primero sigue siendo: " + c.Primero());
    }
}