package QuestaoTrinta;

public class QuestaoTrintaResposta {

    public QuestaoTrintaResposta(String frase)
    {
        System.out.println(inverterFrase(frase));
    }

    private String inverterFrase(String frase)
    {
        String resposta = "";
        for(int i = frase.length()-1; i >= 0; i--)
        {
            resposta += frase.charAt(i);
        }
        return resposta;
    }
    
}