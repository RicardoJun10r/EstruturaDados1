package QuestaoVinteTres;

public class QuestaoVinteTresResposta {

    public QuestaoVinteTresResposta(int numero)
    {
        int fatorial = 1;
        for(int i = numero; i > 0; i--)
        {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }

}