package QuestaoQuarenta;

import java.io.IOException;

import util.ArquivoTexto;

public class QuestaoQuarentaResposta {
    
    private String PATH_CRIPTOGRAFAR;
   
    private String PATH_DESCRIPTOGRAFAR;

    private ArquivoTexto arquivoTexto;

    private String textoOutput = "";

    public QuestaoQuarentaResposta(String frase) throws IOException{
        this.setPathCriptografar();
        this.setPathDescriptografar();
        this.executar(frase);
    }

    private void executar(String frase) throws IOException{
        this.arquivoTexto = new ArquivoTexto();

        System.out.println("Criptografando...");
        try {
            arquivoTexto.escritor(this.PATH_CRIPTOGRAFAR, criptografar(frase));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lendo arquivo criptografado");
        try {
			this.textoOutput = this.arquivoTexto.leitor(this.PATH_CRIPTOGRAFAR);
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
            arquivoTexto.escritor(this.PATH_DESCRIPTOGRAFAR, descriptografar(this.textoOutput));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lendo arquivo descriptografado");
        try {
			this.textoOutput = this.arquivoTexto.leitor(this.PATH_DESCRIPTOGRAFAR);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}
    }

    private void setPathCriptografar(){
        
        this.PATH_CRIPTOGRAFAR = "ListaUmED1/src/temp/zenit.txt";
    }

    private void setPathDescriptografar(){
        
        this.PATH_DESCRIPTOGRAFAR = "ListaUmED1/src/temp/polar.txt";
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
