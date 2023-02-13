package QuestaoTrintaSeis;

public class QuestaoTrintaSeisReposta {
    
    public QuestaoTrintaSeisReposta(int numero)
    {
        System.out.println(this.fatorial(numero));
    }

    private int fatorial(int numero)
    {
        if(numero == 0)
        {
            return 1;
        } 
        else {
            return numero*fatorial(numero-1);
        }
    }
}
