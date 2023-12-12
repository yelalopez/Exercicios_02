import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número de notas: ");
        int value = input.nextInt();
        double count = 0.0;
        double average = 0.0;

        for(int i = 0; i < value; i++){
            System.out.println("Insira a nota #" + (i + 1));
            count += input.nextDouble();
        }
        average = count / value;

        System.out.printf("A média é : %.2f", average);
    }
}
