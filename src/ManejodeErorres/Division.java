package ManejodeErorres;

public class Division {
    public static void main(String[]args){
        int a = 6;
        int b = 0;
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                    "La division entre 0 no se puede ");
        }
    }
}

