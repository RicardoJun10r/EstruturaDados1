package QuestaoTrintaNove;

import java.util.ArrayList;
import java.util.List;

import util.Pessoa;

public class QuestaoTrintaNoveResposta {
    
    private List<Pessoa> pessoas;

    public QuestaoTrintaNoveResposta()
    {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public String create(Pessoa pessoa)
    {
        this.pessoas.add(pessoa);
        return pessoa.toString() + " foi adicionada";
    }

    public String read(String cpf)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                return this.pessoas.get(i).toString();
            }
        }
        return "\nnão encontrado!\n";
    }

    public String update(String cpf, Pessoa pessoa)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                this.pessoas.set(i, pessoa);
                return "atualizado";
            }
        }
        return "\nnão encontrado!\n";
    }

    public String delete(String cpf)
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            if(this.pessoas.get(i).getCpf().equals(cpf))
            {
                this.pessoas.remove(i);
                return "deletado";
            }
        }
        return "\nnão encontrado!\n";
    }

    public void listar()
    {
        for(int i = 0; i < this.pessoas.size(); i++)
        {
            System.out.println(this.pessoas.get(i).toString());
        }
    }

    public void clean()
    {
        this.pessoas.clear();
    }

}
