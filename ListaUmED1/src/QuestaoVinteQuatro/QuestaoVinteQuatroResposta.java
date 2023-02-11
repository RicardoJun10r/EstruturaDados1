package QuestaoVinteQuatro;

import java.util.Scanner;

public class QuestaoVinteQuatroResposta {

    private Scanner scaner = new Scanner(System.in);
    
    public QuestaoVinteQuatroResposta()
    {
        this.menu();
    }
    
    private void menu()
    {
        int opcao;
        do {
            System.out.println("MENU CALCULADORA");
            System.out.println("1 - potenciacao");
            System.out.println("2 - raiz quadrada");
            System.out.println("3 - fatorial");
            System.out.println("0 - sair");
            System.out.print("Opcao: ");
            opcao = this.scaner.nextInt();
            System.out.println();
            this.calculadora(opcao);
        } while (opcao != 0);
    }

    private void calculadora(int opcao)
    {
        switch (opcao) {
            case 1:
                this.potenciacao();
                break;
            case 2:
                this.raizQuadrada();
                break;
            case 3:
                this.fatorial();
                break;
            case 0:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }

    private void potenciacao()
    {
        int numero, expoente;
        System.out.println("Digite um numero:");
        numero = this.scaner.nextInt();
        System.out.println("Digite um expoente:");
        expoente = this.scaner.nextInt();
        System.out.println("Resultado: " + (Math.pow(numero, expoente)));
        System.out.println();
    }

    private void fatorial()
    {
        int numero, fatorial = 1;
        System.out.println("Digite um numero:");
        numero = this.scaner.nextInt();
        for(int i = numero; i > 0; i--)
        {
            fatorial *= i;
        }
        System.out.println("Resultado: " + fatorial);
        System.out.println();
    }
    
    private void raizQuadrada()
    {
        int numero;
        System.out.println("Digite um numero:");
        numero = this.scaner.nextInt();
        System.out.println("Resultado: " + (Math.sqrt(numero)));
        System.out.println();
    }
}