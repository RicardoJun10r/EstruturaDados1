package QuestaoQuarenta;

import java.io.IOException;

import util.ArquivoTexto;

public class QuestaoQuarentaResposta {
    
    private final String PATH_CRIPTOGRAFAR = "$HOME/ListaUmED1/src/temp/zenit.txt";
   
    private final String PATH_DESCRIPTOGRAFAR = "$HOME/ListaUmED1/src/temp/polar.txt";

    private ArquivoTexto arquivoTexto;

    private String textoOutput = "";

    public QuestaoQuarentaResposta(String frase)
    {
        this.arquivoTexto = new ArquivoTexto();

        System.out.println("Criptografando...");
        try {
            arquivoTexto.escritor(PATH_CRIPTOGRAFAR, criptografar(frase));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lendo arquivo criptografado");
        try {
			this.textoOutput = this.arquivoTexto.leitor(PATH_CRIPTOGRAFAR);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}

        System.out.println("Descriptografando...");
        try {
            arquivoTexto.escritor(PATH_DESCRIPTOGRAFAR, descriptografar(this.textoOutput));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lendo arquivo descriptografado");
        try {
			this.textoOutput = this.arquivoTexto.leitor(PATH_DESCRIPTOGRAFAR);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}

    }

    private String criptografar(String texto)
    {
        String novo_texto = "";
        
        for(int i = 0; i < texto.length(); i++)
        {
            novo_texto += zenitPolar(texto.charAt(i));
        }

        return novo_texto;
    }

    private String descriptografar(String texto)
    {
        String novo_texto = "";
        
        for(int i = 0; i < texto.length(); i++)
        {
            novo_texto += zenitPolar(texto.charAt(i));
        }

        return novo_texto;
    }

    private String zenitPolar(char c)
    {
        String res = "";
        res += c;
        switch(c){
            case 'z':
                res = res.replace('z', 'p');
                break;
            case 'e':
                res = res.replace('e', 'o');
                break;
            case 'n':
                res = res.replace('n', 'l');
                break;
            case 'i':
                res = res.replace('i', 'a');
                break;
            case 't':
                res = res.replace('t', 'r');
                break;

            case 'p':
                res = res.replace('p', 'z');
                break;
            case 'o':
                res = res.replace('o', 'e');
                break;
            case 'l':
                res = res.replace('l', 'n');
                break;
            case 'a':
                res = res.replace('a', 'i');
                break;
            case 'r':
                res = res.replace('r', 't');
                break;
            default:
                break;    
        }
        return res;
    }

}
