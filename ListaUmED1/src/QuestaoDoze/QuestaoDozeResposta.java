package QuestaoDoze;

public class QuestaoDozeResposta {

    public QuestaoDozeResposta(double nota1, double nota2, double nota3)
    {
        double media = ((nota1*1)+(nota2*1)+(nota3*2))/(1+1+2);
        if(media > 7.0)
        {
            System.out.println("APROVADO");
        }
        else
        {
            System.out.println("REPROVADO ou FINAL");
        }
    }

}