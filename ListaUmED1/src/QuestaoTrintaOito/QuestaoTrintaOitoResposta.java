package QuestaoTrintaOito;

public class QuestaoTrintaOitoResposta {

    public <T> QuestaoTrintaOitoResposta(T objeto)
    {
        System.out.println("Imprimindo usando toString");
        this.usandoToString(objeto);
    }

    public <T> QuestaoTrintaOitoResposta(T[]vetor)
    {
        System.out.println("Imprimindo objeto | vetor sem toString");
        this.imprimirVetor(vetor);
    }

    public <T> QuestaoTrintaOitoResposta(T[]vetor, T objeto)
    {
        this.usandoToString(objeto);
        System.out.println();
        this.imprimirVetor(vetor);
    }

    private <T> void usandoToString(T objeto)
    {
        System.out.println(objeto.toString());
    }

    private <T> void imprimirVetor(T[]vetor)
    {
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(i + "° = " + vetor[i]);
        }
    }
    
}