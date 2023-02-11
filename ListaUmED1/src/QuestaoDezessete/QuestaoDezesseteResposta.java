package QuestaoDezessete;

public class QuestaoDezesseteResposta {

    public QuestaoDezesseteResposta(int inicio, int fim)
    {
        loopWhile(inicio, fim);
        loopFor(inicio, fim);
        loopDoWhile(inicio, fim);
    }
    private void loopWhile(int inicio, int fim)
    {
        System.out.println("WHILE");
        int contador = inicio;
        while (contador < fim) {
            if(contador%2 != 0){
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println();
    }

    private void loopFor(int inicio, int fim)
    {
        System.out.println("FOR");
        for(int i = inicio; i < fim; i++)
        {
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private void loopDoWhile(int inicio, int fim)
    {
        System.out.println("DO WHILE");
        int contador = inicio;
        do {
            if(contador%2 != 0){
                System.out.print(contador + " ");
            }
            contador++;
        } while (contador < fim);
        System.out.println();
    }   
}