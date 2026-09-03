public class ColaTDA5 {

    private int[] datos;
    private int cantidad;

    // Inicializa la cola
    public void InicializarCola() {
        datos = new int[100];
        cantidad = 0;
    }

    // Agrega un elemento al final de la cola
    public void Acolar(int x) {
        datos[cantidad] = x;
        cantidad++;
    }

    // Elimina el primer elemento
    public void Desacolar() {
        for (int i = 0; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }

        cantidad--;
    }

    // Devuelve el primer elemento
    public int Primero() {
        return datos[0];
    }

    // Indica si la cola está vacía
    public boolean ColaVacia() {
        return cantidad == 0;
    }
}