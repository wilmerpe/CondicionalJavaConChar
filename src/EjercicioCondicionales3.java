import java.util.Scanner;

public class EjercicioCondicionales3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un cáracter: ");
        char letra = teclado.nextLine().charAt(0);

        if(Character.isUpperCase(letra)){
            System.out.println("La letra " + letra + " está en mayúscula");
        }else{
            System.out.println("La letra " + letra + " está en minúscula");
        }
    }
}
