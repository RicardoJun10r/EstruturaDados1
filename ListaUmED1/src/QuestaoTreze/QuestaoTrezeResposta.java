package QuestaoTreze;

public class QuestaoTrezeResposta {

    public QuestaoTrezeResposta(double nota1, double nota2, double nota3)
    {
        double media = (nota1 + nota2 + nota3)/3;
        if(media > 7.0)
        {
            System.out.println("APROVADO");
        }
        else
        {
            System.out.println("RECUPERACAO");
            double nota4 = Math.random();
            media = (media + nota4)/2;
            if(media > 5)
            {
                System.out.println("APROVADO");
            }
            else
            {
                System.out.println("REPROVADO");
            }
        }
    }
    
}