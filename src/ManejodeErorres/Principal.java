package ManejodeErorres;

public class Principal {
    public static void main(String[] args) {
        int[] numeros={1,2,3};

        System.out.println("Valor");
        try {
            System.out.println(numeros[3]);

        } catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println("Final");
    }
}
