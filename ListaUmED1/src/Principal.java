import QuestaoUm.QuestaoUmResposta;
import QuestaoVinte.QuestaoVinteResposta;
import QuestaoVinteCinco.QuestaoVinteCincoResposta;
import QuestaoVinteDois.QuestaoVinteDoisResposta;
import QuestaoVinteNove.QuestaoVinteNoveResposta;
import QuestaoVinteNoveAtualizada.QuestaoVinteNoveRespostaAtualizada;
import QuestaoVinteOito.QuestaoVinteOitoResposta;
import QuestaoVinteQuatro.QuestaoVinteQuatroResposta;
import QuestaoVinteSeis.QuestaoVinteSeisResposta;
import QuestaoVinteSete.QuestaoVinteSeteResposta;
import QuestaoVinteTres.QuestaoVinteTresResposta;
import QuestaoVinteUm.QuestaoVinteUmResposta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import QuestaoCinco.QuestaoCincoResposta;
import QuestaoDez.QuestaoDezResposta;
import QuestaoDezenove.QuestaoDezenoveResposta;
import QuestaoDezesseis.QuestaoDezesseisResposta;
import QuestaoDezessete.QuestaoDezesseteResposta;
import QuestaoDezoito.QuestaoDezoitoResposta;
import QuestaoDois.QuestaoDoisResposta;
import QuestaoDoze.QuestaoDozeResposta;
import QuestaoNove.QuestaoNoveResposta;
import QuestaoOito.QuestaoOitoResposta;
import QuestaoOnze.QuestaoOnzeResposta;
import QuestaoQuarenta.QuestaoQuarentaResposta;
import QuestaoQuarentaUm.QuestaoQuarentaUmResposta;
import QuestaoQuatorze.QuestaoQuatorzeResposta;
import QuestaoQuatro.QuestaoQuatroResposta;
import QuestaoQuinze.QuestaoQuinzeResposta;
import QuestaoSeis.QuestaoSeisResposta;
import QuestaoSete.QuestaoSeteResposta;
import QuestaoTres.QuestaoTresResposta;
import QuestaoTreze.QuestaoTrezeResposta;
import QuestaoTrinta.QuestaoTrintaResposta;
import QuestaoTrintaCinco.QuestaoTrintaCincoResposta;
import QuestaoTrintaDois.QuestaoTrintaDoisResposta;
import QuestaoTrintaNove.QuestaoTrintaNoveResposta;
import QuestaoTrintaOito.QuestaoTrintaOitoResposta;
import QuestaoTrintaQuatro.QuestaoTrintaQuatroResposta;
import QuestaoTrintaSeis.QuestaoTrintaSeisReposta;
import QuestaoTrintaSete.QuestaoTrintaSeteResposta;
import QuestaoTrintaTres.QuestaoTrintaTresResposta;
import QuestaoTrintaUm.QuestaoTrintaUmResposta;

/**Classej principal das respostas das questões
* @author Ricardo Cezar Fernandes de Melo Junior
* @version 1.0.0
*/

public class Principal {

    private static Scanner scaner = new Scanner( System.in );

    private static List<Integer> historicoQuestoes = new ArrayList<>();

    private static String PATH;
    public static void main(String[] args) throws IOException {

        // Para utilizar basta escrever o número da questão e responder do que se pede para ver a resolução da questão

        // Algumas questões exigem PATH para escrever arquivos binários e de texto, se a questão der errado, configure o PATH de maneira correta, colocando todo o caminho até a pasta ( temp ) deste projeto
        
        // Se alguma questão der erro, comente o ( do-while ) e estancie a questão fora do loop

        // Para números double ou float UTILIZE A  (VÍRGULA )

        // PARA CONFIGURAR O PATH COPIE E COLE O CAMINHO DA SUA MÁQUINA ATÉ A PASTA  ( TEMP ) DESTE PROJETO NA VARIÁVEL ( PATH )
        // EXEMPLO
        // $HOME/ListaED1/src/temp

        System.out.println("Para iniciar é necessário configurar o PATH, pois algumas questões utiliza manipulação de arquivos");
        System.out.println("Digite o PATH:");
        PATH = scaner.next();
        System.out.println("Configurado, agora pode inicializar!");

        int opcao;
        do {
            for(int i = 1; i <= 41; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Qual questão quer ver ? [99] - Histórico de questões [0] - Para sair");
            opcao = scaner.nextInt();
            scaner.nextLine();
            menu(opcao);
            System.out.println();
        } while (opcao != 0);
        scaner.close();

        // Se alguma questão der errado estancie ela aqui abaixo

        // Se alguma questão der errado estancie ela aqui acima
    }

    private static void menu(int opcao) throws IOException{
        switch (opcao) {
            case 99:
                System.out.println("\n----Questões vizualizadas----\n");
                System.out.println(historicoQuestoes.toString());
                break;
            case 0:
                System.out.println("Saindo!!!");
                break;
            case 1:
                QuestaoUmResposta questaoUmResposta = new QuestaoUmResposta();
                historicoQuestoes.add(1);
                break;
            case 2:
                int idade;
                String nome;
                char letra;
                double altura;
                System.out.println("Nome:");
                nome = scaner.next();
                System.out.println("Idade:");
                idade = scaner.nextInt();
                System.out.println("Altura:");
                altura = scaner.nextDouble();
                System.out.println("Letra:");
                letra = scaner.next().charAt(0);
                QuestaoDoisResposta questaoDoisResposta = new QuestaoDoisResposta(idade, altura, letra, nome);
                System.out.println(questaoDoisResposta.toString());
                historicoQuestoes.add(2);
                break;
            case 3:
                int numero1, numero2;
                System.out.println("Digite um número:");
                numero1 = scaner.nextInt();
                System.out.println("Digite outro número:");
                numero2 = scaner.nextInt();
                QuestaoTresResposta questaoTresResposta = new QuestaoTresResposta(numero1, numero2);
                historicoQuestoes.add(3);
                break;
            case 4:
                int numero3;
                System.out.println("Digite o primeiro número:");
                numero1 = scaner.nextInt();
                System.out.println("Digite o segundo número:");
                numero2 = scaner.nextInt();
                System.out.println("Digite o terceiro número:");
                numero3 = scaner.nextInt();
                QuestaoQuatroResposta questaoQuatroResposta = new QuestaoQuatroResposta(numero1, numero2, numero3);
                historicoQuestoes.add(4);
                break;
            case 5:
                double numero_1, numero_2, numero_3;
                System.out.println("Digite o primeiro número:");
                numero_1 = scaner.nextDouble();
                System.out.println("Digite o segundo número:");
                numero_2 = scaner.nextDouble();
                System.out.println("Digite o terceiro número:");
                numero_3 = scaner.nextDouble();
                QuestaoCincoResposta questaoCincoResposta = new QuestaoCincoResposta(numero_1, numero_2, numero_3);
                historicoQuestoes.add(5);
                break;
            case 6:
                int pessoas, refrigerante, pizzas;
                System.out.println("Digite o número de pessoas:");
                pessoas = scaner.nextInt();
                System.out.println("Digite o número de refrigerantes:");
                refrigerante = scaner.nextInt();
                System.out.println("Digite o número de pizzas:");
                pizzas = scaner.nextInt();
                QuestaoSeisResposta questaoSeisResposta = new QuestaoSeisResposta(pessoas, refrigerante, pizzas);
                historicoQuestoes.add(6);
                break;
            case 7:
                System.out.println("Digite o primeiro número:");
                numero_1 = scaner.nextDouble();
                System.out.println("Digite o segundo número:");
                numero_2 = scaner.nextDouble();
                QuestaoSeteResposta questaoSeteResposta = new QuestaoSeteResposta(numero_1, numero_2);
                historicoQuestoes.add(7);
                break;
            case 8:
                System.out.println("Digite a altura:");
                numero_1 = scaner.nextDouble();
                System.out.println("Digite o peso:");
                numero_2 = scaner.nextDouble();
                QuestaoOitoResposta questaoOitoResposta = new QuestaoOitoResposta(numero_2, numero_1);
                historicoQuestoes.add(8);
                break;
            case 9:
                System.out.println("Digite o raio da circunferência:");
                numero_1 = scaner.nextDouble();
                QuestaoNoveResposta questaoNoveResposta = new QuestaoNoveResposta(numero_1);
                historicoQuestoes.add(9);
                break;
            case 10:
                System.out.println("Digite um número:");
                numero1 = scaner.nextInt();
                QuestaoDezResposta questaoDezResposta = new QuestaoDezResposta(numero1);
                historicoQuestoes.add(10);
                break;
            case 11:
                QuestaoOnzeResposta  questaoOnzeResposta = new QuestaoOnzeResposta();
                historicoQuestoes.add(11);
                break;
            case 12:
                System.out.println("Digite a primeira nota:");
                numero_1 = scaner.nextDouble();
                System.out.println("Digite o segunda nota:");
                numero_2 = scaner.nextDouble();
                System.out.println("Digite o terceira nota:");
                numero_3 = scaner.nextDouble();
                QuestaoDozeResposta questaoDozeResposta = new QuestaoDozeResposta(numero_1, numero_2, numero_3);
                historicoQuestoes.add(12);
                break;
            case 13:
                System.out.println("Digite a primeira nota:");
                numero_1 = scaner.nextDouble();
                System.out.println("Digite o segunda nota:");
                numero_2 = scaner.nextDouble();
                System.out.println("Digite o terceira nota:");
                numero_3 = scaner.nextDouble();
                QuestaoTrezeResposta questaoTrezeResposta = new QuestaoTrezeResposta(numero_1, numero_2, numero_3);
                historicoQuestoes.add(13);
                break;
            case 14:
                System.out.println("Digite o valor de a:");
                numero1 = scaner.nextInt();
                System.out.println("Digite o valor de b:");
                numero2 = scaner.nextInt();
                System.out.println("Digite o valor de c:");
                numero3 = scaner.nextInt();
                QuestaoQuatorzeResposta questaoQuatorzeResposta = new QuestaoQuatorzeResposta(numero1, numero2, numero3);
                historicoQuestoes.add(14);
                break;
            case 15:
                System.out.println("Digite um numero:");
                numero1 = scaner.nextInt();
                QuestaoQuinzeResposta questaoQuinzeResposta = new QuestaoQuinzeResposta(numero1);
                historicoQuestoes.add(15);
                break;
            case 16:
                int comeco, fim;
                System.out.println("Digite o número inicial:");
                comeco = scaner.nextInt();
                System.out.println("Digite o número final:");
                fim = scaner.nextInt();
                QuestaoDezesseisResposta questaoDezesseisResposta = new QuestaoDezesseisResposta(comeco, fim);
                historicoQuestoes.add(16);
                break;
            case 17:
                System.out.println("Digite o número inicial:");
                comeco = scaner.nextInt();
                System.out.println("Digite o número final:");
                fim = scaner.nextInt();
                QuestaoDezesseteResposta questaoDezesseteResposta = new QuestaoDezesseteResposta(comeco, fim);
                historicoQuestoes.add(17);
                break;
            case 18:
                QuestaoDezoitoResposta questaoDezoitoResposta = new QuestaoDezoitoResposta();
                historicoQuestoes.add(18);
                break;
            case 19:
                System.out.println("Digite um numero:");
                numero1 = scaner.nextInt();
                QuestaoDezenoveResposta questaoDezenoveResposta = new QuestaoDezenoveResposta(numero1);
                historicoQuestoes.add(19);
                break;
            case 20:
                double investimentoInicial, investimentoMensal, taxaJuros;
                int meses;
                System.out.println("Digite o investimento inicial:");
                investimentoInicial = scaner.nextDouble();
                System.out.println("Digite o investimento mensal:");
                investimentoMensal = scaner.nextDouble();
                System.out.println("Digite a quantidade de meses:");
                meses = scaner.nextInt();
                System.out.println("Digite a taxa de juros:");
                taxaJuros = scaner.nextDouble();
                QuestaoVinteResposta questaoVinteResposta = new QuestaoVinteResposta(investimentoInicial, investimentoMensal, meses, taxaJuros);
                historicoQuestoes.add(20);
                break;
            case 21:
                System.out.println("Digite um número:");
                numero1 = scaner.nextInt();
                QuestaoVinteUmResposta questaoVinteUmResposta = new QuestaoVinteUmResposta(numero1);
                historicoQuestoes.add(21);
                break;
            case 22:
                System.out.println("Digite o número inicial:");
                comeco = scaner.nextInt();
                System.out.println("Digite o número final:");
                fim = scaner.nextInt();
                QuestaoVinteDoisResposta questaoVinteDoisResposta = new QuestaoVinteDoisResposta(comeco, fim);
                historicoQuestoes.add(22);
                break;
            case 23:
                System.out.println("Digite um número para calcular fatorial:");
                numero1 = scaner.nextInt();
                QuestaoVinteTresResposta questaoVinteTresResposta = new QuestaoVinteTresResposta(numero1);
                historicoQuestoes.add(23);
                break;
            case 24:
                QuestaoVinteQuatroResposta questaoVinteQuatroResposta = new QuestaoVinteQuatroResposta();
                historicoQuestoes.add(24);
                break;
            case 25:
                QuestaoVinteCincoResposta questaoVinteCincoResposta = new QuestaoVinteCincoResposta();
                historicoQuestoes.add(25);
                break;
            case 26:
                QuestaoVinteSeisResposta questaoVinteSeisResposta = new QuestaoVinteSeisResposta();
                historicoQuestoes.add(26);
                break;
            case 27:
                int tamanho_vetor;
                System.out.println("Tamanho do vetor:");
                tamanho_vetor = scaner.nextInt();
                QuestaoVinteSeteResposta questaoVinteSeteResposta = new QuestaoVinteSeteResposta(tamanho_vetor);
                historicoQuestoes.add(27);
                break;
            case 28:
                System.out.println("Tamanho do vetor:");
                tamanho_vetor = scaner.nextInt();
                QuestaoVinteOitoResposta questaoVinteOitoResposta = new QuestaoVinteOitoResposta(tamanho_vetor);
                historicoQuestoes.add(28);
                break;
            case 29:
                int[]vetor = new int[5];
                System.out.println("Tamanho do vetor:");
                tamanho_vetor = scaner.nextInt();
                System.out.println("--Questão vinte nove normal--");
                QuestaoVinteNoveResposta questaoVinteNoveResposta = new QuestaoVinteNoveResposta(tamanho_vetor);
                System.out.println("--Questão vinte nove normal ATUALIZADA--");
                System.out.println("Inicialize o vetor com tamanho " + tamanho_vetor);
                for(int i = 0; i < vetor.length; i++)
                {
                    System.out.print(i + "° = ");
                    vetor[i] = scaner.nextInt();
                }
                System.out.println("Posicao no vetor:");
                numero1 = scaner.nextInt();
                QuestaoVinteNoveRespostaAtualizada questaoVinteNoveRespostaAtualizada = new QuestaoVinteNoveRespostaAtualizada(vetor, numero1);
                historicoQuestoes.add(29);
                break;
            case 30:
                String frase;
                System.out.println("Digite uma frase:");
                frase = scaner.nextLine();
                QuestaoTrintaResposta questaoTrintaResposta = new QuestaoTrintaResposta(frase);
                historicoQuestoes.add(30);
                break;
            case 31:
                QuestaoTrintaUmResposta questaoTrintaUmResposta = new QuestaoTrintaUmResposta();
                historicoQuestoes.add(31);
                break;
            case 32:
                QuestaoTrintaDoisResposta questaoTrintaDoisResposta = new QuestaoTrintaDoisResposta();
                questaoTrintaDoisResposta.setPath(PATH);
                questaoTrintaDoisResposta.executar();
                historicoQuestoes.add(32);
                break;
            case 33:
                String palavra;
                System.out.println("Digite uma palavra:");
                palavra = scaner.next();
                QuestaoTrintaTresResposta questaoTrintaTresResposta = new QuestaoTrintaTresResposta(palavra);
                historicoQuestoes.add(33);
                break;
            case 34:
                System.out.println("Digite uma frase:");
                frase = scaner.nextLine();
                QuestaoTrintaQuatroResposta questaoTrintaQuatroResposta = new QuestaoTrintaQuatroResposta(frase);
                historicoQuestoes.add(34);
                break;
            case 35:
                System.out.println("Digite uma frase:");
                frase = scaner.nextLine();
                QuestaoTrintaCincoResposta questaoTrintaCincoResposta = new QuestaoTrintaCincoResposta();
                questaoTrintaCincoResposta.setPath(PATH);
                questaoTrintaCincoResposta.executar(frase);
                historicoQuestoes.add(35);
                break;
            case 36:
                System.out.println("Digite um numero para calcular fatorial:");
                numero1 = scaner.nextInt(); 
                QuestaoTrintaSeisReposta questaoTrintaSeisReposta = new QuestaoTrintaSeisReposta(numero1);
                historicoQuestoes.add(36);
                break;
            case 37:
                System.out.println("Digite o número inicial:");
                comeco = scaner.nextInt();
                System.out.println("Digite o número final:");
                fim = scaner.nextInt();
                QuestaoTrintaSeteResposta questaoTrintaSeteResposta = new QuestaoTrintaSeteResposta(comeco, fim);
                historicoQuestoes.add(37);
                break;
            case 38:
                System.out.println("Tamanho do vetor:");
                tamanho_vetor = scaner.nextInt();
                Integer[] vetorInteger = new Integer[tamanho_vetor];
                System.out.println("Inicialize o vetor:");
                for(int i = 0; i < vetorInteger.length; i++)
                {
                    System.out.print(i + "° = ");
                    vetorInteger[i] = scaner.nextInt();
                }
                System.out.println();
                QuestaoTrintaOitoResposta questaoTrintaOitoResposta = new QuestaoTrintaOitoResposta(vetorInteger);
                QuestaoTrintaOitoResposta questaoTrintaOitoResposta2 = new QuestaoTrintaOitoResposta(historicoQuestoes);
                historicoQuestoes.add(38);
                break;
            case 39:
                QuestaoTrintaNoveResposta questaoTrintaNoveResposta = new QuestaoTrintaNoveResposta();
                historicoQuestoes.add(39);
                break;
            case 40:
                System.out.println("Escreva uma frase:");
                frase = scaner.nextLine();
                QuestaoQuarentaResposta questaoQuarentaResposta = new QuestaoQuarentaResposta();
                questaoQuarentaResposta.setPathCriptografar(PATH);
                questaoQuarentaResposta.setPathDescriptografar(PATH);
                questaoQuarentaResposta.executar(frase);
                historicoQuestoes.add(40);
                break;
            case 41:
                QuestaoQuarentaUmResposta questaoQuarentaUmResposta = new QuestaoQuarentaUmResposta();
                historicoQuestoes.add(41);
                break;
            default:
                System.out.println("Questão inexistente!!!");
                break;
        }
    }
}
