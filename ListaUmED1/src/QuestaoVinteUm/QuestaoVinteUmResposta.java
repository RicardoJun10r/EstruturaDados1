package QuestaoVinteUm;

public class QuestaoVinteUmResposta {

    public QuestaoVinteUmResposta(int numero)
    {
        if(isPrimo(numero)){
            System.out.println("PRIMO");
        } else{
            System.out.println("NÃO PRIMO");
        }
    }

    private boolean isPrimo(int numero)
    {
        int contador = 0;
        for(int i = 0; i <= numero; i++)
        {
            if(i%numero == 0){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        } else{
            return false;
        }
    }
    
}