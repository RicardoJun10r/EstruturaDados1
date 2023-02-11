package QuestaoVinte;

public class QuestaoVinteResposta {

    public QuestaoVinteResposta(double investimentoInicial, double investimentoMensal, int meses, double jurosMensal)
    {
        System.out.println("Rendimento Mensal: R$ " + this.rendimentoMensal(investimentoMensal, jurosMensal));
        System.out.println("Saldo acumulado: R$ " + this.saldoAcumulado(investimentoInicial, investimentoMensal, meses, jurosMensal));
    }

    private double rendimentoMensal(double investimentoMensal, double jurosMensal)
    {
        double montante = investimentoMensal * Math.pow((1+jurosMensal), 1);
        return montante;
    }

    private double saldoAcumulado(double investimentoInicial, double investimentoMensal, int meses, double jurosMensal)
    {
        double saldo = 0;
        saldo += this.rendimentoMensal(investimentoInicial, jurosMensal);
        for(int i = 0; i < meses; i++)
        {
            saldo += this.rendimentoMensal(investimentoMensal, jurosMensal);
        }
        return saldo;
    }
    
}