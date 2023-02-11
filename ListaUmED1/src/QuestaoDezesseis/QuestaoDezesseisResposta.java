package QuestaoDezesseis;

public class QuestaoDezesseisResposta {

    public QuestaoDezesseisResposta(int inicio, int fim)
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
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();
    }

    private void loopFor(int inicio, int fim)
    {
        System.out.println("FOR");
        for(int i = inicio; i < fim; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void loopDoWhile(int inicio, int fim)
    {
        System.out.println("DO WHILE");
        int contador = inicio;
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador < fim);
        System.out.println();
    }
}