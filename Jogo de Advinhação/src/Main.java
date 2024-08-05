//importando bibliotecas
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //definindo o input e o randomizador
        Scanner scan = new Scanner(System.in);
        Random rm = new Random();

        //criando uma variavel que tem um numero aleatório entre 1 a 50 gerado pela biblioteca
        int numero = rm.nextInt(49)+1; //foi botado até 49 + 1 para não ser gerado o numero 0

        //instruindo o jogador sobre o jogo
        System.out.println("escolha um numero de 1 a 50 (5 tentativas)");
            System.out.println("chute um numero");

        //loop do do jogo
        //o jogador tem 5 tentativas
        for (int i = 1; i <= 5; i++) {



            //pede um input do jogador(um umero entre 0 a 50)
            int numerochutado = scan.nextInt();



            //caso acerte o numero ele vai acabar com o loop e falar ue o jogador ganhou
            if (numerochutado == numero){
                i = 6; //foi botado para não ativar o if sobre loop da linha abaixo
                System.out.println("você acertou o numero !!!");
            }



            //se o loop chegar ao fim(todas tentativas tiverem sido usadas) acabara com o loop e falará qual era o numero
            if (i == 5) {
                scan.close();
                System.out.println("você gastou todas suas tentativas, o numero era " + numero);

            }



            //caso o numero seja menor que o numero chutado vai printar a seguinte frase
            if (numerochutado > numero){
                System.out.print("o numero é menor que "+numerochutado+" tente outro numero ");
            }



            //caso o numero seja maior que o numero chutado vai printar a seguinte frase
            if (numerochutado < numero){
                System.out.print("o numero é maior que "+numerochutado+" tente outro numero ");
            }



}
}
}