package QuestaoTrinteSeis;

public class QuestaoTrintaSeisReposta {
    
    public QuestaoTrintaSeisReposta(int numero)
    {
        System.out.println(this.fatorial(numero));
    }

    private int fatorial(int numero)
    {
        if(numero == 0)
        {
            return numero = 1;
        }
        else
        {
            return numero*fatorial(numero-1);
        }
    }
}
