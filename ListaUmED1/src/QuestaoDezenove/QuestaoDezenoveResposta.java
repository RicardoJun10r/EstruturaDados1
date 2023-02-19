package QuestaoDezenove;

public class QuestaoDezenoveResposta {

    public QuestaoDezenoveResposta(int numero)
    {
        this.tabuada(numero);

        // Desconmente o código abaixo para apresentar uma tabuada de 0 a 100
        
        // this.tabuadaGigante();
    }

    private void tabuada(int numero)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
        System.out.println();
    }

    private void tabuadaGigante()
    {
        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j <= 10; j++)
            {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
            System.out.println();
        }
        System.out.println();
    }
    
}