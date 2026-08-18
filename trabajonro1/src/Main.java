public class Main {
    public static void main(String[] args){
        producto p1= new producto(1,"impresora",100,0);
        producto p2= new producto(2,"computadora",150,2);
        p1.mostrardatos();
        System.out.println("--");
        p2.mostrardatos();
        System.out.println("stock disponible: "+ p2.consultarStock());
        p2.ingresarStock(10);
        p2.ingresarStock(7);
        System.out.println("stock nuevo: "+ p2.consultarStock());
        p2.venderProducto(30);
        System.out.println("quedan: " + p2.consultarStock() + " en stock");
        p2.venderProducto(4);
        System.out.println("quedan: " + p2.consultarStock() + " en stock");


    }
}