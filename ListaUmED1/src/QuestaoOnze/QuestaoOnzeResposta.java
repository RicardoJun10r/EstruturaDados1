package QuestaoOnze;

public class QuestaoOnzeResposta {

    public QuestaoOnzeResposta()
    {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        System.out.println("Conta UM saldo: " + conta1.getSaldo());
        System.out.println("Conta DOIS saldo: " + conta2.getSaldo());
        transferencia(50, conta1, conta2);
        System.out.println("Conta UM saldo: " + conta1.getSaldo());
        System.out.println("Conta DOIS saldo: " + conta2.getSaldo());
    }

    private void transferencia(int valor, ContaBancaria conta1, ContaBancaria conta2)
    {
        if(conta1.getSaldo() > valor)
        {
            conta1.setSaldo(conta1.getSaldo()-valor);
            conta2.setSaldo(conta2.getSaldo()+valor);
        }
        else
        {
            System.out.println("ERRO");
        }
    }

}