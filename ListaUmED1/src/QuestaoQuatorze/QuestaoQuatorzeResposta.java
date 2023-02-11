package QuestaoQuatorze;

public class QuestaoQuatorzeResposta {

    public QuestaoQuatorzeResposta(int a, int b, int c)
    {
        int[] raiz = new int[2];

        raiz = raizes(delta(a, b, c), a, b);

        System.out.println("Raiz UM: " + raiz[0]);
        System.out.println("Raiz DOIS: " + raiz[1]);

    }

    private int delta(int a, int b, int c)
    {
        return ((int)(Math.pow(b, 2)) - 4*a*c);
    }

    private int[] raizes(int delta, int a, int b)
    {
        int[] resposta = new int[2];
        resposta[0] = (-b + delta)/2*a;
        resposta[1] = (-b - delta)/2*a;
        return resposta;
    }
    
}