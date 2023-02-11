package QuestaoTrintaUm;

import java.util.ArrayList;
import java.util.List;
import util.Pessoa;

public class QuestaoTrintaUmResposta {

    private List<Pessoa> pessoas;

    public QuestaoTrintaUmResposta()
    {
        this.criarLista();
        this.mostrarPessoas();
        this.pessoas.clear();
    }

    private void criarLista()
    {
        this.pessoas = new ArrayList<>();
        for(int i = 0; i < 4; i++)
        {
            Pessoa pessoa = new Pessoa("Wanderlei"+i, "012912102", (i+1)*10, 'M', (i+1)*10, (i+1)*100);
            this.pessoas.add(pessoa);
        }
    }

    private void mostrarPessoas()
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            System.out.println(this.pessoas.get(i).toString());
        }
    }
    
}