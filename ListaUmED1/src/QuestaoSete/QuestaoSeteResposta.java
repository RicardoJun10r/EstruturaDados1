package QuestaoSete;

public class QuestaoSeteResposta {

    public QuestaoSeteResposta(double numero1, double numero2)
    {
        if(numero1 == 0 || numero2 == 0)
        {    
            System.out.println("ERRO!");
        }

        System.out.println("Resposta: " + (numero1/numero2));   
    }
}