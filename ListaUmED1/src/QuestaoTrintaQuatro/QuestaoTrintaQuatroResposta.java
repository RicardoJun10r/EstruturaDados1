package QuestaoTrintaQuatro;

import java.util.HashSet;
import java.util.Set;

public class QuestaoTrintaQuatroResposta
{
	public QuestaoTrintaQuatroResposta(String frase)
	{

		Set<String> hashSet = new HashSet<>();
		String[] palavra = frase.split(" ");
		int cont;
		
		for(int i = 0; i < palavra.length; i++){
			hashSet.add(palavra[i]);
		}

		String[] contarPalavra = new String[hashSet.size()];

		int k = 0;
		for(String ele : hashSet)
			contarPalavra[k++] = ele;

		for(int i = 0; i < contarPalavra.length; i++)
		{
			cont = 0;
			for(int j = 0; j < palavra.length; j++)
			{
				if(contarPalavra[i].equals(palavra[j]))
				{
					cont++;
				}
			}
			System.out.println(contarPalavra[i] + " = " + cont);
		}
	}
}
