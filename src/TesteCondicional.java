import java.util.Scanner;

public class TesteCondicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Testando condicionais ");
        // Atribuindo valores para variaveis
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Quantas pessoas voce está acompanhado: ");
        int quantidadePessoas = sc.nextInt();
        // Testando se a condição idade e maior ou igual 18
        if (idade >= 18) {
            System.out.println("Voce tem mais de 18 anos "); // Testando condição
            System.out.println("Seja bem vindo");
        }
        // Se caso a idade for menor que 18 vamos testar uma nova condição se a quantidadePessoa for maior que 2 e for maiores de idade
        else if (quantidadePessoas >= 2) { // testando condiçao
            System.out.println("Voce não tem 18, mais pode entrar, pois está acompanhado por maiores ");
        } else {
            System.out.println("Infelizmente voce não pode entrar, pois precisa de um adulto!! ");
        }
    }

}
