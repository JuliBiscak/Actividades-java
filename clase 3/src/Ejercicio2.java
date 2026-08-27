public class Ejercicio2 {

    static int cantidadElementos(PilaTDA p) {

        PilaTDA aux = new PilaTDA();
        aux.InicializarPila();

        int contador = 0;

        while (!p.PilaVacia()) {

            int elemento = p.Tope();

            aux.Apilar(elemento);
            p.Desapilar();

            contador++;
        }

        while (!aux.PilaVacia()) {

            int elemento = aux.Tope();

            p.Apilar(elemento);
            aux.Desapilar();
        }

        return contador;
    }


    public static void main(String[] args) {

        PilaTDA p = new PilaTDA();
        p.InicializarPila();

        p.Apilar(4);
        p.Apilar(8);
        p.Apilar(2);
        p.Apilar(6);

        int cantidad = cantidadElementos(p);

        System.out.println("Cantidad de elementos: " + cantidad);
        System.out.println("Tope después de contar: " + p.Tope());
    }
}
