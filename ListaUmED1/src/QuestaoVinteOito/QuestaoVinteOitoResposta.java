package QuestaoVinteOito;

import java.util.Random;

public class QuestaoVinteOitoResposta {

    private Random random;

    private int[] vetor;

    public QuestaoVinteOitoResposta(int tamanho)
    {
        this.vetor = new int[tamanho];
        this.iniciarVetor(this.vetor);
        this.escreverBarra(tamanho);
        this.mostrar();
        this.escreverBarra(tamanho);
        System.out.println("Maior: " + this.maiorNumero(this.vetor));
    }

    private void escreverBarra(int TAMANHO)
    {
        System.out.println();
        for(int i = 0; i < TAMANHO*2; i++)
        {
            System.out.print("=");
        }
        System.out.println();
    }

    private void mostrar()
    {
        for(int i = 0; i < this.vetor.length; i++)
        {
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println();
    }

    private int maiorNumero(int[]vetor)
    {
        int maior = 0;

        for(int i = 0; i < this.vetor.length; i++)
        {
            if(maior <= this.vetor[i]){
                maior = this.vetor[i];
            }
        }
        return maior;
    }

    private void iniciarVetor(int[]vetor)
    {
        this.random = new Random();
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = this.random.nextInt(0, 100);
        }
    }
    
}