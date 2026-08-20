public class Cola {

    private int[] datos;
    private int cantidad;

    // InicializarCola
    public void inicializarCola() {
        datos = new int[10];
        cantidad = 0;
    }

    // ColaVacia
    public boolean colaVacia() {
        return cantidad == 0;
    }
}