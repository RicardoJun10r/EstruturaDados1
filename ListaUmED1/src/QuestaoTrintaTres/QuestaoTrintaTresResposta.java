package QuestaoTrintaTres;

public class QuestaoTrintaTresResposta
{

	private String word;

	public QuestaoTrintaTresResposta(String palavra)
	{

		String jaSaiu = "";
		this.word = palavra;
		int cont = 0;

		for(int i = 0; i < word.length(); i++)
		{

			cont = 0;

			if(jaSaiu.indexOf(word.charAt(i)) == -1){
				
				for(int j = 0; j < word.length(); j++){
					
					if(word.charAt(j) == word.charAt(i)){
						cont++;
					}

				}

			}
			if(cont != 0)
			{
				System.out.println(word.charAt(i) + " = " + cont);
			}
			jaSaiu += word.charAt(i);
		}
		
		this.limparPalavra();
	}

	private void limparPalavra()
	{
		this.word = "";
	}

}
