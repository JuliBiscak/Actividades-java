public class ConjuntoTDA {

    private int[] elementos;
    private int cantidad;

    public void InicializarConjunto() {
        elementos = new int[100];
        cantidad = 0;
    }

    public void Agregar(int x) {
        if (!Pertenece(x)) {
            elementos[cantidad] = x;
            cantidad++;
        }
    }

    public void Sacar(int x) {
        int i = 0;

        while (i < cantidad && elementos[i] != x) {
            i++;
        }

        if (i < cantidad) {
            elementos[i] = elementos[cantidad - 1];
            cantidad--;
        }
    }

    public boolean Pertenece(int x) {
        int i = 0;

        while (i < cantidad && elementos[i] != x) {
            i++;
        }

        return i < cantidad;
    }

    public int Elegir() {
        return elementos[0];
    }

    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }
}