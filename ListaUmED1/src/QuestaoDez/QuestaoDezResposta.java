package QuestaoDez;

public class QuestaoDezResposta {

    public QuestaoDezResposta(int numero)
    {
        if(numero % 2 == 0)
        {
            System.out.println("PAR");
        }
        else
        {
            System.out.println("IMPAR");
        }
    }
    
}