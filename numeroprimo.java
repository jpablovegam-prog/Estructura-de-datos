import java.util.Scanner;

public class numeroprimo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int numero = leer.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero + i ==0){
                    primo = false;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " no es numero primo. ");
        } else {
            System.out.println(numero + " es numero primo. ");
        }

        leer.close();
    }
}
