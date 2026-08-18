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
    public int consultarStock(){
        return cantidad;
    }

    public void ingresarStock(int ingreso){
        cantidad = cantidad + ingreso;
    }

    public void venderProducto(int salida){
        if (salida <= cantidad) {
            cantidad = cantidad - salida;
        } else {
            System.out.println("cantidad insuficiente para vender");
        }
    }


}
