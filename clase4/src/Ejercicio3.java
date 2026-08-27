public class Ejercicio3 {

    static boolean contiene(PilaTDA3 p, int x) {

        PilaTDA3 aux = new PilaTDA3();
        aux.InicializarPila();

        boolean encontrado = false;

        while (!p.PilaVacia()) {

            int elemento = p.Tope();

            if (elemento == x) {
                encontrado = true;
            }

            aux.Apilar(elemento);
            p.Desapilar();
        }

        while (!aux.PilaVacia()) {

            p.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return encontrado;
    }
//EJEMPLO:
    public static void main(String[] args) {

        PilaTDA3 p = new PilaTDA3();
        p.InicializarPila();

        p.Apilar(7);
        p.Apilar(3);
        p.Apilar(9);
        p.Apilar(6);
        p.Apilar(8);

        System.out.println(contiene(p,5 ));
    }
}