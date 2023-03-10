package QuestaoTrintaDois;

import java.io.IOException;
import java.util.List;

import QuestaoTrintaUm.QuestaoTrintaUmResposta;
import util.ArquivoBinario;
import util.Pessoa;

public class QuestaoTrintaDoisResposta {
    
    private String PATH;

    public QuestaoTrintaDoisResposta() throws IOException{
        this.setPath();
        this.executar();
    }

    private void executar() throws IOException
    {
        QuestaoTrintaUmResposta questaoTrintaUmResposta = new QuestaoTrintaUmResposta();
        questaoTrintaUmResposta.salvarLista(this.PATH);
        this.lerArquivo(this.PATH);
    }

    private void setPath()
    {
        this.PATH = "ListaUmED1/src/temp/questaoTrintaDois.dat";
    }

    private void lerArquivo(String path)
    {
        ArquivoBinario arquivoBinario = new ArquivoBinario();
        try {
			List<Object> listOutput = arquivoBinario.load(path);
			
            System.out.println("Lendo...");
			for (Object object : listOutput) 
			{
				Pessoa pessoa = (Pessoa) object;
				System.out.println( pessoa.toString() );
			}
			
		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}
    }
}
