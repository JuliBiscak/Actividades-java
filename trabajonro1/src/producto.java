public class producto {
    public int codigo;
    public String nombre;
    public int precio;
    public int cantidad;

    public producto(int codigo,String nombre,int precio,int cantidad) {
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad =cantidad;
        this.codigo=codigo;

    }
    public void mostrardatos(){
        System.out.println("nombre "+ nombre);
        System.out.println("precio "+ precio);
        System.out.println("codigo " + codigo);
        System.out.println("cantidad " + cantidad);
    }


}
