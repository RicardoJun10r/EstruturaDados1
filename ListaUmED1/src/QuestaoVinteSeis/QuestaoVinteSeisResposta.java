package QuestaoVinteSeis;

public class QuestaoVinteSeisResposta {

    private final int LINHAS = 5;
    private final int COLUNAS = 5;
    private int [][] matriz = new int[this.LINHAS][this.COLUNAS];
    
    public QuestaoVinteSeisResposta()
    {
        this.iniciarMatriz();
        this.mostrar();
    }
    
    private void iniciarMatriz()
    {
        for(int i = 0; i < this.LINHAS; i++)
        {
            for(int j = 0; j < this.COLUNAS; j++)
            {
                this.matriz[i][j] = i+j;
            }
        }
    }

    private void mostrar()
    {
        System.out.println("====================");
        for(int i = 0; i < this.LINHAS; i++)
        {
            for(int j = 0; j < this.COLUNAS; j++)
            {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }
}