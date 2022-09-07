package Figuras;

public class Prueba {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo (9,10,10,10,10);
        Triangulo triangulo2 = new Triangulo (34,44,34,34,34);
        System.out.println("El area del triangulo obtenida es: " + triangulo.getArea());
        System.out.println("EL perimetro  del triangulo es: " +triangulo.getPerimetro());
        System.out.println("El area del triangulo es: "+triangulo2.getArea()+"\nEl perimetro " +
                "es: "+triangulo2.getPerimetro());
    }
}
