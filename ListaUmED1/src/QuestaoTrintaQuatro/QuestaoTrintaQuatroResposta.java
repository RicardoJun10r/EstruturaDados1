package QuestaoTrintaQuatro;

public class QuestaoTrintaQuatroResposta
{
	public QuestaoTrintaQuatroResposta(String frase)
	{
		String jaSaiu = "";
		String[] palavra = frase.split(" ");
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(jaSaiu.indexOf(palavra[i]) == -1)
			{
				for(int j = 0; j < frase.length(); j++)
				{
					if(palavra[i] == palavra[j])
					{
						cont++;
					}
				}
			}
			if(cont != 0)
			{
				System.out.println(palavra[i] + " = " + cont);
			}
			jaSaiu += palavra[i];
		}
	}
}
