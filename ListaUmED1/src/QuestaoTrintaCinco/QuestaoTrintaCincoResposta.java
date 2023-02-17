package QuestaoTrintaCinco;

import java.io.IOException;

import QuestaoTrintaQuatro.QuestaoTrintaQuatroResposta;
import util.ArquivoTexto;

public class QuestaoTrintaCincoResposta {

    private final String PATH = "$HOME/ListaUmED1/src/temp/questaoTrintaCinco.csv";
    
    public QuestaoTrintaCincoResposta(String frase) throws IOException {
        QuestaoTrintaQuatroResposta questaoTrintaQuatroResposta = new QuestaoTrintaQuatroResposta(frase);
        System.out.println("Escrevendo arquivo...");
        this.escreverArquivo(this.PATH, questaoTrintaQuatroResposta.getResultado());
        System.out.println("Lendo arquivo...");
        this.lerArquivo(this.PATH);
    }

    private void escreverArquivo(String path, String texto) throws IOException{
        ArquivoTexto arquivoTexto = new ArquivoTexto();
        arquivoTexto.escritorCsv(PATH, texto);
    }

    private void lerArquivo(String path) throws IOException {
        ArquivoTexto arquivoTexto = new ArquivoTexto();
        String textoOutput;
        try {
			textoOutput = arquivoTexto.leitorCsv(path);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}
    }
}
