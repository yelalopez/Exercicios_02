import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Resto");
        System.out.println("6 - Raiz");
        System.out.println("7 - Potencia");

        System.out.println("Escolha uma operação: ");
        int choice = input.nextInt();

        if (choice < 1 || choice > 7) {
            System.out.println("Valor inválido!");
            return;
        }

        System.out.println("Insira o valor 1");
        double value1 = input.nextDouble();

        System.out.println("Insira o valor 2");
        double value2 = input.nextDouble();

        input.close();
        double result = 0.0;


        switch (choice) {
            case 1:
                result = value1 + value2;
                System.out.println("Resultado = " + result);
                break;
            case 2:
                result = value1 - value2;
                System.out.println("Resultado = " + result);
                break;
            case 3:
                result = value1 * value2;
                System.out.println("Resultado = " + result);
                break;
            case 4:
                if (value2 != 0) {
                    result = value1 / value2;
                    System.out.println("Resultado = " + result);
                } else {
                    System.out.println("Erro! Divisão por 0 não é permitida!");
                    return;
                }
                break;
            case 5:
                result = value1 % value2;
                System.out.println("Resultado = " + result);
                break;
            case 6:
                result = Math.sqrt(value1);
                System.out.println("Resultado = " + result);
                break;
            case 7:
                result = Math.pow(value1, value2);
                System.out.println("Resultado = " + result);
                break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}
