package Generico;

public class Principal {
    public static void main(String[] args) {
        ClaseG gen1 = new ClaseG<>("hola");
        System.out.println(gen1.getDato());

        Personaa p1 =new Personaa("Oyuki",19,"F","Tenancingo");
        ClaseG<Personaa> gen2=new ClaseG<>(p1);
        System.out.println(gen2.getDato());
    }
}
