package QuestaoOito;

public class QuestaoOitoResposta {

    public QuestaoOitoResposta(double peso, double altura)
    {

        if(peso == 0 || altura == 0)
        {
            System.out.println("ERRO");
        }

        double resposta = peso/(Math.pow(altura, 2));

        System.out.println("IMC: " + resposta);
    }
    
}