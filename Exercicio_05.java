import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = input.nextInt();
        if(num < 0){
            System.out.println("Erro, digite um número inteiro positivo");
            return;
        }
        int fatorial = 1;
        for(long i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println(num +"! = " + fatorial);
    }
}
