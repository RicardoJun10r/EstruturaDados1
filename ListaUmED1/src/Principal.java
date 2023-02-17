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
import util.Pessoa;

import java.io.IOException;
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

public class Principal {

    private static Scanner scaner = new Scanner( System.in );
    public static void main(String[] args) throws IOException {

        // Para ver a resposta, basta descomentar e incializar o objeto de acordo com o que a questão pede.

        int opcao;
        do {
            for(int i = 1; i <= 41; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Qual questão quer ver ?");
            opcao = scaner.nextInt();
            menu(opcao);
            System.out.println();
        } while (opcao != 0);
        scaner.close();
    }

    private static void menu(int opcao) throws IOException{
        switch (opcao) {
            case 0:
                System.out.println("Saindo!!!");
                break;
            case 1:
                QuestaoUmResposta questaoUmResposta = new QuestaoUmResposta();
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
                letra = scaner.nextLine().charAt(0);
                QuestaoDoisResposta questaoDoisResposta = new QuestaoDoisResposta(idade, altura, letra, nome);
                break;
            case 3:
                int numeroUm, numeroDois;
                System.out.println("Digite um número:");
                numeroUm = scaner.nextInt();
                System.out.println("Digite outro número:");
                numeroDois = scaner.nextInt();
                QuestaoTresResposta questaoTresResposta = new QuestaoTresResposta(numeroUm, numeroDois);
                break;
            case 4:
                int numero1, numero2, numero3;
                System.out.println("Digite o primeiro número:");
                numero1 = scaner.nextInt();
                System.out.println("Digite o segundo número:");
                numero2 = scaner.nextInt();
                System.out.println("Digite o terceiro número:");
                numero3 = scaner.nextInt();
                QuestaoQuatroResposta questaoQuatroResposta = new QuestaoQuatroResposta(numero1, numero2, numero3);
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
                break;
            case 7:
                double primeiroNumero, segundoNumero;
                System.out.println("Digite o primeiro número:");
                primeiroNumero = scaner.nextDouble();
                System.out.println("Digite o segundo número:");
                segundoNumero = scaner.nextDouble();
                QuestaoSeteResposta questaoSeteResposta = new QuestaoSeteResposta(primeiroNumero, segundoNumero);
                break;
            case 8:
                double alturaImc, pesoImc;
                System.out.println("Digite a altura:");
                alturaImc = scaner.nextDouble();
                System.out.println("Digite o peso:");
                pesoImc = scaner.nextDouble();
                QuestaoOitoResposta questaoOitoResposta = new QuestaoOitoResposta(pesoImc, alturaImc);
                break;
            case 9:
                double raio;
                System.out.println("Digite o raio da circunferência:");
                raio = scaner.nextDouble();
                QuestaoNoveResposta questaoNoveResposta = new QuestaoNoveResposta(raio);
                break;
            case 10:
                int par_impar;
                System.out.println("Digite um número:");
                par_impar = scaner.nextInt();
                QuestaoDezResposta questaoDezResposta = new QuestaoDezResposta(par_impar);
                break;
            case 11:
                QuestaoOnzeResposta  questaoOnzeResposta = new QuestaoOnzeResposta();
                break;
            case 12:
                double nota1, nota2, nota3;
                System.out.println("Digite a primeira nota:");
                nota1 = scaner.nextDouble();
                System.out.println("Digite o segunda nota:");
                nota2 = scaner.nextDouble();
                System.out.println("Digite o terceira nota:");
                nota3 = scaner.nextDouble();
                QuestaoDozeResposta questaoDozeResposta = new QuestaoDozeResposta(nota1, nota2, nota3);
                break;
            case 13:
                double prova1, prova2, prova3;
                System.out.println("Digite a primeira nota:");
                prova1 = scaner.nextDouble();
                System.out.println("Digite o segunda nota:");
                prova2 = scaner.nextDouble();
                System.out.println("Digite o terceira nota:");
                prova3 = scaner.nextDouble();
                QuestaoTrezeResposta questaoTrezeResposta = new QuestaoTrezeResposta(prova1, prova2, prova3);
                break;
            case 14:
                int a, b, c;
                System.out.println("Digite o valor de a:");
                a = scaner.nextInt();
                System.out.println("Digite o valor de b:");
                b = scaner.nextInt();
                System.out.println("Digite o valor de c:");
                c = scaner.nextInt();
                QuestaoQuatorzeResposta questaoQuatorzeResposta = new QuestaoQuatorzeResposta(a, b, c);
                break;
            case 15:
                int numero;
                System.out.println("Digite um numero:");
                numero = scaner.nextInt();
                QuestaoQuinzeResposta questaoQuinzeResposta = new QuestaoQuinzeResposta(numero);
                break;
            case 16:
                int comeco, fim;
                System.out.println("Digite um numero:");
                comeco = scaner.nextInt();
                System.out.println("Digite outro numero:");
                fim = scaner.nextInt();
                QuestaoDezesseisResposta questaoDezesseisResposta = new QuestaoDezesseisResposta(comeco, fim);
                break;
            case 17:
                int inicio, limite;
                System.out.println("Digite um numero:");
                inicio = scaner.nextInt();
                System.out.println("Digite outro numero:");
                limite = scaner.nextInt();
                QuestaoDezesseteResposta questaoDezesseteResposta = new QuestaoDezesseteResposta(inicio, limite);
                break;
            case 18:
                QuestaoDezoitoResposta questaoDezoitoResposta = new QuestaoDezoitoResposta();
                break;
            case 19:
                int tabuada;
                System.out.println("Digite um numero:");
                tabuada = scaner.nextInt();
                QuestaoDezenoveResposta questaoDezenoveResposta = new QuestaoDezenoveResposta(tabuada);
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
                break;
            case 21:
                int primo;
                System.out.println("Digite um número:");
                primo = scaner.nextInt();
                QuestaoVinteUmResposta questaoVinteUmResposta = new QuestaoVinteUmResposta(primo);
                break;
            case 22:
                int primeiroElemento, ultimoElemento;
                System.out.println("Digite um numero:");
                primeiroElemento = scaner.nextInt();
                System.out.println("Digite outro numero:");
                ultimoElemento = scaner.nextInt();
                QuestaoVinteDoisResposta questaoVinteDoisResposta = new QuestaoVinteDoisResposta(primeiroElemento, ultimoElemento);
                break;
            case 23:
                int fatorial;
                System.out.println("Digite um número:");
                fatorial = scaner.nextInt();
                QuestaoVinteTresResposta questaoVinteTresResposta = new QuestaoVinteTresResposta(fatorial);
                break;
            case 24:
                QuestaoVinteQuatroResposta questaoVinteQuatroResposta = new QuestaoVinteQuatroResposta();
                break;
            case 25:
                QuestaoVinteCincoResposta questaoVinteCincoResposta = new QuestaoVinteCincoResposta();
                break;
            case 26:
                QuestaoVinteSeisResposta questaoVinteSeisResposta = new QuestaoVinteSeisResposta();
                break;
            case 27:
                int tamanho_vetor;
                System.out.println("Tamanho do vetor:");
                tamanho_vetor = scaner.nextInt();
                QuestaoVinteSeteResposta questaoVinteSeteResposta = new QuestaoVinteSeteResposta(tamanho_vetor);
                break;
            case 28:
                int tamanho;
                System.out.println("Tamanho do vetor:");
                tamanho = scaner.nextInt();
                QuestaoVinteOitoResposta questaoVinteOitoResposta = new QuestaoVinteOitoResposta(tamanho);
                break;
            case 29:
                int tamanhoVetor, posicao;
                int[]vetor = new int[5];
                System.out.println("Tamanho do vetor:");
                tamanhoVetor = scaner.nextInt();
                System.out.println("--Questão vinte nove normal--");
                QuestaoVinteNoveResposta questaoVinteNoveResposta = new QuestaoVinteNoveResposta(tamanhoVetor);
                System.out.println("--Questão vinte nove normal ATUALIZADA--");
                System.out.println("Posicao no vetor:");
                posicao = scaner.nextInt();
                System.out.println("Inicialize o vetor:");
                for(int i = 0; i < vetor.length; i++)
                {
                    vetor[i] = scaner.nextInt();
                }
                QuestaoVinteNoveRespostaAtualizada questaoVinteNoveRespostaAtualizada = new QuestaoVinteNoveRespostaAtualizada(vetor, posicao);
                break;
            case 30:
                String frase;
                System.out.println("Digite uma frase:");
                frase = scaner.nextLine();
                QuestaoTrintaResposta questaoTrintaResposta = new QuestaoTrintaResposta(frase);
                break;
            case 31:
                QuestaoTrintaUmResposta questaoTrintaUmResposta = new QuestaoTrintaUmResposta();
                break;
            case 32:
                QuestaoTrintaDoisResposta questaoTrintaDoisResposta = new QuestaoTrintaDoisResposta();
                break;
            case 33:
                String palavra;
                System.out.println("Digite uma palavra:");
                palavra = scaner.next();
                QuestaoTrintaTresResposta questaoTrintaTresResposta = new QuestaoTrintaTresResposta(palavra);
                break;
            case 34:
                String sentenca;
                System.out.println("Digite uma frase:");
                sentenca = scaner.nextLine();
                QuestaoTrintaQuatroResposta questaoTrintaQuatroResposta = new QuestaoTrintaQuatroResposta(sentenca);
                break;
            case 35:
                String frase_dois;
                System.out.println("Digite uma frase:");
                frase_dois = scaner.nextLine();
                QuestaoTrintaCincoResposta questaoTrintaCincoResposta = new QuestaoTrintaCincoResposta(frase_dois);
                break;
            case 36:
                int fatorialRecursivo;
                System.out.println("Digite um numero:");
                fatorialRecursivo = scaner.nextInt(); 
                QuestaoTrintaSeisReposta questaoTrintaSeisReposta = new QuestaoTrintaSeisReposta(fatorialRecursivo);
                break;
            case 37:
                System.out.println("Digite um numero:");
                primeiroElemento = scaner.nextInt();
                System.out.println("Digite outro numero:");
                ultimoElemento = scaner.nextInt();
                QuestaoTrintaSeteResposta questaoTrintaSeteResposta = new QuestaoTrintaSeteResposta(primeiroElemento, ultimoElemento);
                break;
            case 38:
                System.out.println("Tamanho do vetor:");
                tamanhoVetor = scaner.nextInt();
                Integer[] vetorInteger = new Integer[tamanhoVetor];
                System.out.println("Inicialize o vetor:");
                for(int i = 0; i < vetorInteger.length; i++)
                {
                    vetorInteger[i] = scaner.nextInt();
                }
                QuestaoTrintaOitoResposta questaoTrintaOitoResposta = new QuestaoTrintaOitoResposta(vetorInteger);
                break;
            case 39:
                QuestaoTrintaNoveResposta questaoTrintaNoveResposta = new QuestaoTrintaNoveResposta();
                break;
            case 40:
                String zenitPolar;
                System.out.println("Escreva uma frase:");
                zenitPolar = scaner.nextLine();
                QuestaoQuarentaResposta questaoQuarentaResposta = new QuestaoQuarentaResposta(zenitPolar);
                break;
            case 41:
                QuestaoQuarentaUmResposta questaoQuarentaUmResposta = new QuestaoQuarentaUmResposta();
                break;
            default:
                System.out.println("Questão inexistente!!!");
                break;
        }
    }
}
