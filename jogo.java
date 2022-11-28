/*
 * **************************************
 *  JOGO DA ADIVINHAÇÃO DE NÚMERO       *
 *       Paula Matuoka - 2022           *
 * **************************************
*/

// Importar a classe Random da biblioteca util para gerar números aleatórios.
import java.util.Random;

// Importar a classe Scanner para poder entrar (digitar) valores durante a
// execução do programa.
import java.util.Scanner;

// Criar a classe pública Main
public class Main {
    
    // Vamos definir "constantes globais", ou seja, valores que serão sempre o mesmo toda vez que
    // uma instância da classe Main for criada.
    // PRIVATE = campo disponível apenas dentro da classe Main.
    // STATIC = é sempre o mesmo valor em todas as instâncias da classe Main.
    // FINAL = não pode ser alterado posteriormente.
    // INT = número inteiro.
    
    // Criar uma instância da classe Random:
    private static final Random r = new Random();
    
    // Criar uma constante chamada NUMBER que vai armazenar um número.
    // aleatório entre 1 e 100 (com esses números inclusos).
    private static final int NUMERO_SORTEADO = r.nextInt(100) + 1;
    
    // Cria uma variável que vai conter o número digitado pelo usuário.
    private static int palpite = 0;


    // Esta é a função principal da classe Main:
    public static void main(String[] args) {  
        
        // Cria uma instância da classe Scanner que monitora o sistema de entrada de dados (teclado).
        Scanner jogador = new Scanner(System.in);
        
            // DEBUG: essa linha é usada pelo programador para verificar se há algum problema com o código.
            System.out.println("*** LINHA DEBUGG: NUMERO_SORTEADO é igual a " + String.valueOf(NUMERO_SORTEADO) + "! ***");
            
            // LOOP WHILE: o sistema continua a executar até que seja atingido o critério de parada..
            
            // "Enquando o palpite for diferente do número sorteado, faça:"
            while ( palpite != NUMERO_SORTEADO ) {
                
            // Imprime na tela a regra do jogo:
            System.out.println("Adivinhe o número! Digite um número de 1 e 100: ");
            
            // o palpite recebe o valor digitado pelo jogador quando ele tecla ENTER.
            palpite = jogador.nextInt();
            
            // VERIFICAÇÃO DO CRITÉRIO DE PARADA:
            
            // 1ª condição: se o palpite for maior que o número sorteado, imprima a mensagem:
            if ( palpite > NUMERO_SORTEADO ) {
                System.out.println("Tá muito alto!");
            
            // 2ª condição:  se o palpite for menor que o número sorteado, imprima a mensagem:
            } else if ( palpite < NUMERO_SORTEADO ) {
                System.out.println("Tá muito baixo!");
                
            // Caso as condições anteriores forem falsas, imprima a mensagem e encerre o jogo com sucesso.
            // ESSE É O CRITÉRIO DE PARADA DO LOOP WHILE!
            } else {
                System.out.println("Acertou!");
                System.exit(0);
            }
        }
  }
}
