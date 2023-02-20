public class TesteCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condicionais ");
        int idade = 20;
        int quantidadePessoa = 3;
        if ( idade >= 18) {
            System.out.println("Voce tem mais de 18 anos "); // Testando condição
        }
        else if (quantidadePessoa >= 2){
            System.out.println("Voce não tem 18, mais pode entrar, pois está acompanhado por maiores ");
        }
        else {
            System.out.println("Infelizmente voce não pode entrar");
        }
    }

}
