public class PilaTDA {

    private int[] datos;
    private int cantidad;

    public void InicializarPila() {
        datos = new int[10];
        cantidad = 0;
    }

    public void Apilar(int x) {
        datos[cantidad] = x;
        cantidad++;
    }

    public void Desapilar() {
        cantidad--;
    }

    public int Tope() {
        return datos[cantidad - 1];
    }

    public boolean PilaVacia() {
        return cantidad == 0;
    }
}