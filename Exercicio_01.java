import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um inteiro: ");
        int value = input.nextInt();

        if (!(value % 2 == 0)) {
            System.out.println("Weird");
        } else if (value >= 2 && value <= 5) {
            System.out.println("Not Weird");
        } else if (value >= 6 && value <= 20) {
            System.out.println("Weird");
        } else if (value > 20) {
            System.out.println("Not Weird");
        }
    }
}

