import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, soy la calculadora de Marce Pez y estoy feliz de verte :D" + "\n");
        System.out.println("Indica el primer número: ");
        int numeroUno = teclado.nextInt();
        System.out.println("Indica el segundo número: ");
        int numeroDos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("El resultado de la suma es " + (numeroUno + numeroDos));
        System.out.println("El resultado de la resta es " + (numeroUno - numeroDos));
        System.out.println("El resultado de la multiplicación es " + (numeroUno * numeroDos));
        System.out.println("El resultado de la división es " + (numeroUno / numeroDos));
        System.out.println("El resultado del resto de la división es " + (numeroUno % numeroDos));
}}