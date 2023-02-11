package QuestaoSeis;

public class QuestaoSeisResposta {

    private final double REFRIGERANTE = 1.5;

    private final double PIZZA = 3.0;

    private final double TAXA_GARCOM = 1.1;

    public QuestaoSeisResposta(int pessoas , int refrigerante, int pizza)
    {
        double total;
        total = totalSemTaxa(refrigerante, pizza);
        System.out.println("Total ( SEM TAXA ): R$" + total);
        System.out.println();
        total = total*this.TAXA_GARCOM;
        System.out.println("Total ( COM TAXA ): R$" + total);
        System.out.println();
        System.out.println("Rateio por pessoa: R$" + rateio(total, pessoas));
        System.out.println();
    }
    
    private double rateio(double total, int pessoas)
    {
        return total/pessoas;
    }

    private double totalSemTaxa(int refrigerante, int pizza)
    {
        return (refrigerante*this.REFRIGERANTE) + (pizza*this.PIZZA);
    }

}
