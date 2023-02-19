package QuestaoTrintaSete;

public class QuestaoTrintaSeteResposta {
    
    public QuestaoTrintaSeteResposta(int inicio, int fim)
    {
        Long tempoInicial, tempoFinal, tempoExecucao;
        
        tempoInicial = System.currentTimeMillis();
        System.out.println(this.estruturaRepeticao(inicio, fim));
        tempoFinal = System.currentTimeMillis();
        tempoExecucao = (tempoFinal-tempoInicial);
        System.out.println("Tmepo de execução" + tempoExecucao);
        tempoInicial = 0L;
        tempoFinal = 0L;
        System.out.println("==================================");
        tempoInicial = System.currentTimeMillis();
        System.out.println(this.recursivo(inicio, fim));
        tempoFinal = System.currentTimeMillis();
        tempoExecucao = (tempoFinal-tempoInicial);
        System.out.println("Tmepo de execução" + tempoExecucao);
    }

    private int estruturaRepeticao(int inicio, int fim)
    {
        int resposta = 0;
        for(int i = inicio; i <= fim;i++)
        {
            resposta+=i;
        }
        return resposta;
    }

    private int recursivo(int inicio, int fim)
    {
        if(inicio == fim)
        {
            return fim;
        }
        else
        {
            return inicio + recursivo(inicio+1, fim);
        }
    }

}
