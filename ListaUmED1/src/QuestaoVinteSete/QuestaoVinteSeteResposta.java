package QuestaoVinteSete;

public class QuestaoVinteSeteResposta {

    private int[] vetorNormal;
    
    private int[] vetorInverso;

    public QuestaoVinteSeteResposta(int tamanho)
    {
        this.vetorNormal = new int[tamanho];
        this.vetorInverso = new int[tamanho];
        
        for(int i = 0; i < tamanho; i++)
        {   
            this.vetorNormal[i] = i;
        }
        
        this.mostrar(this.vetorNormal);
        System.out.println();
        this.inverter(this.vetorNormal);
        System.out.println();
        this.mostrar(this.vetorInverso);
    }

    private void inverter(int[]vetor)
    {
        int cont = 0;
        for(int i = vetor.length-1; i > 0; i--)
        {
            this.vetorInverso[cont] = vetor[i];
            cont++;
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