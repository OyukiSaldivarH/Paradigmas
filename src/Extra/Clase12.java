package Extra;

public class Clase12 {
    private  static String mensaje= "Hola";

     private static int numero (int v1){


    return v1++;
}
    public static void main(String[] args) {
        Clase12 obj1 = new Clase12();
        Clase12 obje2 = new Clase12();
        obje2.mensaje = "mundo";
        System.out.println(obj1.mensaje);
        System.out.println(obje2.mensaje);
        System.out.println("el resultado es :"+Clase12.numero(6));

    }
}
