package QuestaoDezoito;

import java.util.Scanner;

public class QuestaoDezoitoResposta {

    private final String SENHA = "senha123";

    private Scanner scanner = new Scanner( System.in );

    public QuestaoDezoitoResposta()
    {
        this.loginWhile();
        this.loginDoWhile();
        this.scanner.close();
    }

    private void loginWhile()
    {
        String tentantiva;
        System.out.println("Digite a senha:");
        tentantiva = this.scanner.next();
        while(!this.login(tentantiva))
        {
            System.out.println("Digite a senha novamente:");
            tentantiva = this.scanner.next();
        }
    }

    private void loginDoWhile()
    {
        String tentantiva;
        do {
            System.out.println("Digite a senha:");
            tentantiva = this.scanner.next();
        } while (!this.login(tentantiva));
    }
    
    private boolean login(String senha)
    {
        if(senha.equals(this.SENHA)){
            System.out.println("senha correta!!!");
            return true;
        }
        return false;
    }
}