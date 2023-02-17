package QuestaoTrintaUm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import util.ArquivoBinario;
import util.Pessoa;

public class QuestaoTrintaUmResposta {

    private List<Pessoa> pessoas;
    private List<Object> listaObjetos;

    public QuestaoTrintaUmResposta()
    {
        listaObjetos = new ArrayList<>();
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
            listaObjetos.add(pessoa);
        }
    }

    public void salvarLista(String path) throws IOException
    {
        ArquivoBinario arquivoBinario = new ArquivoBinario();

        try {
            arquivoBinario.save(this.listaObjetos, path);
        } catch (Exception e) {
            System.out.println("erro na escrita");
            e.printStackTrace();
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