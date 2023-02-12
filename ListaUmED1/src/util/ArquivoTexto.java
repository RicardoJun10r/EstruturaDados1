package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTexto {
    
    public ArquivoTexto(){}

    public void escritor(String path, String texto) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(path) );
		bufferedWriter.append(texto);
		bufferedWriter.close();
	}

    public String leitor(String path) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader( new FileReader(path) );
		
		StringBuffer sbResult = new StringBuffer();
		String linha = "";
		
		while (linha != null) 
		{
			sbResult.append(linha + "\n");
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
		
		return sbResult.toString();
	}

}
