package QuestaoQuinze;

public class QuestaoQuinzeResposta {

    public QuestaoQuinzeResposta(int numero)
    {
        switch (numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
    }
    
}