import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int valueX = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = valueX * i;
            System.out.println(valueX + " x " + i + " = " + resultado);
        }

    }
}


