package QuestaoVinteCinco;

import java.util.Scanner;

public class QuestaoVinteCincoResposta {

    private Scanner scanner = new Scanner(System.in);

    private int[] vetor;

    public QuestaoVinteCincoResposta()
    {
        int tamanho;
        
        System.out.println("Tamanho do vetor:");
        tamanho = this.scanner.nextInt();
        this.vetor = new int[tamanho];

        this.iniciarVetor(tamanho);
        System.out.println();
        this.mostrar();
    }

    private void iniciarVetor(int tamanho)
    {
        for(int i = 0; i < tamanho; i++)
        {
            System.out.print((i+1) + "° Digite o valor: ");
            this.vetor[i] = this.scanner.nextInt();
            System.out.println();
        }
    }

    private void mostrar()
    {
        for(int i = 0; i < this.vetor.length; i++)
        {
            System.out.println(i + "° = " + this.vetor[i]);
        }
        System.out.println();
    }

}