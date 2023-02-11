package QuestaoDoze;

public class QuestaoDozeResposta {

    public QuestaoDozeResposta(double nota1, double nota2, double nota3)
    {
        double media = (nota1+nota2+nota3)/3;
        if(media > 7.0)
        {
            System.out.println("APROVADO");
        }
        else
        {
            System.out.println("REPROVADO");
        }
    }

}