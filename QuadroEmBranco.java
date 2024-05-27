import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadroEmBranco {

//    Escreva um programa que solicite ao usuário
//    uma sequência de números. Conte quantos números
//    são positivos e quantos são negativos. Utilize
//    uma estrutura de repetição for para percorrer a sequência.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayDeNumeros = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.println("DIGITE UM NUMERO: ");
            int qtd = scanner.nextInt();
            arrayDeNumeros[i] = qtd;
        }

        int positivos = 0;
        int negativos = 0;
        int neutros = 0;

        for (int i = 0; i < arrayDeNumeros.length; i++){
            if (arrayDeNumeros[i] > 0){
                positivos++;
            } else if (arrayDeNumeros[i] < 0){
                negativos--;
            } else {
                neutros++;
            }
        }

        System.out.println("Numeros positivos: "+positivos);
        System.out.println("Numeros negativos: "+negativos);
        System.out.println("Numeros neutros: "+neutros);

        scanner.close();

        float teste = 111.22222f;
        double teste2 = 1111.23222;
    }
}


