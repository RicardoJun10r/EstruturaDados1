package QuestaoVinteNove;

import java.util.Random;

public class QuestaoVinteNoveResposta {

    private Random random;
    private int[]vetor;
    private int[]vetorRodado;
    public QuestaoVinteNoveResposta(int tamanho)
    {
        this.vetor = new int[tamanho];
        this.iniciarVetor();
        this.mostrar(this.vetor);
        this.rodarVetor();
        this.mostrar(this.vetorRodado);
    }

    private void iniciarVetor()
    {
        this.random = new Random();
        for(int i = 0; i < this.vetor.length; i++)
        {
            this.vetor[i] = this.random.nextInt(0, 100);
        }
    }

    private void rodarVetor()
    {
        this.vetorRodado = new int[this.vetor.length];
        int aux = 0;
        for(int i = 0; i < this.vetor.length; i++)
        {
            aux = (aux+1)%this.vetor.length;
            this.vetorRodado[aux] = this.vetor[i];
        }
    }

    private void mostrar(int[]vetor)
    {
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    
}