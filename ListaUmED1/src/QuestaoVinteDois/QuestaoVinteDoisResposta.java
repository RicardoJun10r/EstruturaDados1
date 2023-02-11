package QuestaoVinteDois;

public class QuestaoVinteDoisResposta {

    public QuestaoVinteDoisResposta(int inicio, int fim)
    {
        int contador = 0;
        for(int i = inicio; i < fim; i++)
        {
            contador += i;
        }
        System.out.println(contador);
    }
    
}